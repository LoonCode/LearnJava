import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-4-8
 * Time: 下午10:59
 * To change this template use File | Settings | File Templates.
 */
public class SleepingTask extends LiftOff {
    public void run() {
        while (countDown-- > 0) {
            System.out.println(stastus());

            try {
                // Old style
//                Thread.sleep(200);

                // Java SE5 style
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.err.println("Interrupted");
            }

        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            executorService.submit(new SleepingTask());
        }
        executorService.shutdown();
    }
}
