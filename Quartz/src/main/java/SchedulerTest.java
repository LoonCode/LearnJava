import com.google.common.io.Resources;
import org.quartz.*;

import java.io.IOException;
import java.util.Properties;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by Loon on 2014/9/18.
 */
public class SchedulerTest {

    public static void main(String[] args) throws SchedulerException {

        Properties properties = new Properties();

        try {
            properties.load(Resources.getResource("quartz.properties").openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }


        SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory(properties);

        Scheduler sched = schedFact.getScheduler();

        sched.start();
        {
            // define the job and tie it to our HelloJob class
            JobDetail job = newJob(JobOne.class)
                    .withIdentity("myJob", "group1")
                    .build();

            // Trigger the job to run now, and then every 40 seconds
            Trigger trigger = newTrigger()
                    .withIdentity("myTrigger", "group1")
                    .startNow()
                    .withSchedule(simpleSchedule()
                            .withIntervalInSeconds(10)
                            .repeatForever())
                    .build();

            // Tell quartz to schedule the job using our trigger
            sched.scheduleJob(job, trigger);
        }


        {
            // define the job and tie it to our HelloJob class
            JobDetail job = newJob(JobTwo.class)
                    .withIdentity("myJob2", "group1")
                    .build();

            // Trigger the job to run now, and then every 40 seconds
            Trigger trigger = newTrigger()
                    .withIdentity("myTrigger2", "group1")
                    .startNow()
                    .withSchedule(simpleSchedule()
                            .withIntervalInSeconds(10)
                            .repeatForever())
                    .build();

            // Tell quartz to schedule the job using our trigger
            sched.scheduleJob(job, trigger);


        }

//        sched.getListenerManager().addJobListener(new AllJobListener(), allJobs());
//        sched.getListenerManager().addSchedulerListener(new SchedulerListenerTest());
        sched.getListenerManager().addTriggerListener(new TriggerListenerTest());
    }
}
