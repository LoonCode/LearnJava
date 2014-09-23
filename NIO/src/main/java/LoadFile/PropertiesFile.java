package LoadFile;

import com.google.common.collect.Maps;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Loon on 2014/9/23.
 */
public class PropertiesFile {


    public static void main(String[] args) throws IOException {
        getPropertiesFile();
    }

    /**
     * 加载Properties文件
     *
     * @return
     * @throws IOException
     */
    private static String getPropertiesFile() throws IOException {

        Resource resource = new ClassPathResource("config.properties");
        Properties properties = PropertiesLoaderUtils.loadProperties(resource);
        Map<String, String> variableMap = Maps.fromProperties(properties);
        return variableMap.get("test");
    }
}
