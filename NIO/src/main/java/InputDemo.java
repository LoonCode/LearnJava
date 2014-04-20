import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-3-31
 * Time: 下午2:51
 * To change this template use File | Settings | File Templates.
 */
public class InputDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        if (!str.isEmpty()&& str.length() > 0)
            System.out.println(str);
    }

}
