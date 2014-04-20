import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-3-30
 * Time: 下午5:13
 * To change this template use File | Settings | File Templates.
 */
public class PropDemo {
    public static void main(String[] args) throws IOException {

//        InputStream inputStream = new FileInputStream(ClassLoader.getSystemResource("")+"\\com\\loon\\util\\person.properties");
//        InputStream inputStream = new FileInputStream(PropDemo.class.getResource("")+"person.properties");
        InputStream inputStream = PropDemo.class.getResourceAsStream("person.properties");
//        InputStream inputStream = new FileInputStream("person.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        String name = properties.getProperty("name");
        String age = properties.getProperty("age");
        String gender = properties.getProperty("gender", "male");
        System.out.println(name);
        System.out.println(gender);

    }
}
