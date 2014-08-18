import com.google.common.collect.Maps;
import com.google.common.io.Files;
import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.util.EnvUtil;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Loon on 2014/7/28.
 */
public class ETLTest {


    public static void main(String[] args) {

//        runTransformation("C:\\Users\\Desktop\\ETL\\set.ktr",null);

        File file = new File("C:\\Users\\Desktop\\ETL\\config.properties");

        Properties properties = new Properties();

        try {
            properties.load(Files.newReader(file, Charset.defaultCharset()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, String> variableMap = Maps.fromProperties(properties);


        runTransformation("C:\\Users\\Desktop\\ETL\\下发.ktr", variableMap); //
//        Map<String, String> paramMap = new HashMap<>();
//        paramMap.put("CONFIG_DIR", "path");
//        runTransformation("path\\set.ktr", paramMap);

//        Type - "s"ystem, "r"oot, "p"arent, "g"randparent. Upto which  level the variable is set.
//
//                Java Virtual Machine：S系统级作用域，凡是在一个java虚拟机下运行的线程都受其影响。
//
//        parent job：在当前作业下是生效的。
//
//        grand-parent job：在当前作业的父作业下是生效的。
//
//        the root job：R级作用域，凡是在跟作业下运行的都是生效的。

    }

    public static void runTransformation(String filename, Map<String, String> paramMap) {

        try {
            KettleEnvironment.init();
            EnvUtil.environmentInit();
            TransMeta transMeta = new TransMeta(filename);
            Trans trans = new Trans(transMeta);

            if (paramMap != null && !paramMap.isEmpty()) {
                for (Map.Entry<String, String> paramEntry : paramMap.entrySet()) {
                    trans.setVariable(paramEntry.getKey(), paramEntry.getValue());
                }
            }

            // set variavle. same can be retrieved using "Get Variables" step
            //trans.setVariable("TEST_VARIABLE_FROM_JAVA", "This value is passsed from java");

            // set parameter. same can be used inside steps in transformation
            //trans.setParameterValue("JAVA_PARAM", "java param value");

            trans.execute(null);
            trans.waitUntilFinished();
            if (trans.getErrors() > 0) {
                throw new RuntimeException("There were errors during transformation execution.");
            }
        } catch (KettleException e) {
            // TODO Put your exception-handling code here.
            e.printStackTrace();
        }
    }


}
