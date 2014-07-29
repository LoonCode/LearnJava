import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.util.EnvUtil;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

/**
 * Created by Loon on 2014/7/28.
 */
public class ETLTest {


    public static void main(String[] args) {

        runTransformation("test2.ktr");

    }

    public static void runTransformation(String filename) {

        try {
            KettleEnvironment.init();
            EnvUtil.environmentInit();
            TransMeta transMeta = new TransMeta(filename);
            Trans trans = new Trans(transMeta);

            trans.execute(null); // You can pass arguments instead of null.
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
