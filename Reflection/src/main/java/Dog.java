import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Loong
 * Date: 13-3-31
 * Time: 下午3:28
 * To change this template use File | Settings | File Templates.
 */
public class Dog extends Animal implements Serializable {

    private int foot;

    public  void  Bark(){
        System.out.println("Wo Wo");
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }
}
