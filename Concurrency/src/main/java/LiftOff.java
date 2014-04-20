/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-4-7
 * Time: 下午9:02
 * To change this template use File | Settings | File Templates.
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;

    }

    public String  stastus() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + ").";

    }

    @Override
    public void run() {
        while (countDown -- >0){
            System.out.println(stastus());
            Thread.yield();
        }
    }
}
