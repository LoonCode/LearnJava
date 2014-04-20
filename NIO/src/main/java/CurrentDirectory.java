import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-3-31
 * Time: 下午2:18
 * To change this template use File | Settings | File Templates.
 */
public class CurrentDirectory {
    public static void main(String[] args) throws IOException {

        System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
        System.out.println(CurrentDirectory.class.getClassLoader().getResource(""));
        System.out.println(ClassLoader.getSystemResource(""));
        System.out.println(CurrentDirectory.class.getResource(""));
        System.out.println(CurrentDirectory.class.getResource("/"));
        System.out.println(new File("").getAbsolutePath());
        System.out.println(System.getProperty("user.dir"));

        // open Current Directory file
//        InputStream inputStream = CurrentDirectory.class.getResourceAsStream("/com/loon/util/person.properties");
//        InputStream inputStream = CurrentDirectory.class.getResourceAsStream("../util/person.properties");
        InputStream inputStream = CurrentDirectory.class.getResourceAsStream("/config/systemConfig.properties");
//        InputStream inputStream = CurrentDirectory.class.getResourceAsStream("../../../config/systemConfig.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String name = properties.getProperty("name");
        String gender = properties.getProperty("gender", "male");
        System.out.println(name);
        System.out.println(gender);
    }
}
