import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-4-7
 * Time: 下午9:12
 * To change this template use File | Settings | File Templates.
 */
public class MainThread {

    public static void main(String[] args) {
//        LiftOff lifrOff = new LiftOff();
//        lifrOff.run();


        // 1.5新特性，启动线程
        //  newCachedThreadPool        newSingleThreadExecutor      newScheduledThreadPool        newFixedThreadPool
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++)
            executorService.submit(new LiftOff());
        executorService.shutdown();
    }
}
