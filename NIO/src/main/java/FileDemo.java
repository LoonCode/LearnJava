import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-3-31
 * Time: 下午1:45
 * To change this template use File | Settings | File Templates.
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {

//        os root path
//        File path = new File("/");

//        Project root path
//        File path = new File(".");

        File path = new File("").getAbsoluteFile();
        String[] list;
        list = path.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }


        //  Absolute Path
        System.out.println(new File("").getAbsolutePath());
        System.out.println(new File("").getCanonicalPath());
        System.out.println(System.getProperty("user.dir"));




    }
}
