/**
 * Created with IntelliJ IDEA.
 * User: Loong
 * Date: 13-3-31
 * Time: 下午3:07
 * To change this template use File | Settings | File Templates.
 */
public enum Week {

    MON("星期一"), TUS("星期二"), WEN("星期三"), THUR("星期四"), FRI("星期五"), SAT("星期六"), SUN("星期日");

    private String chineseName;

    Week(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getChineseName() {
        return chineseName;
    }
}
