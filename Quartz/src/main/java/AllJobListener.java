import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by Loon on 2014/9/18.
 * Job监听器，任务开始执行前，任务
 */
public class AllJobListener implements org.quartz.JobListener {
    @Override
    public String getName() {
        return "test";
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext context) {

    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext context) {
        System.out.println("jobExecutionVetoed");
    }

    @Override
    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
        System.out.println("jobWasExecuted");
    }
}
