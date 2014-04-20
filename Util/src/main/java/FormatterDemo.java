import java.util.Formatter;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-3-30
 * Time: 下午5:03
 * To change this template use File | Settings | File Templates.
 */
public class FormatterDemo {
    public static void main(String[] args) {
        String str = "Hello %s";
        System.out.println(String.format(str, "World"));

        Formatter formatter = new Formatter();
        System.out.println(formatter.format(str, "World"));
        formatter.close();
    }
}
