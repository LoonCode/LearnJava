import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.util.EnvUtil;
import org.pentaho.di.trans.Trans;
import org.pentaho.di.trans.TransMeta;

/**
 * Created by Loon on 2014/7/28.
 */
public class ETLTest {


    public static void main(String[] args) {

    }

    public static void runTransformation(String filename) {
        try {
//            StepLoader.init();
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
            System.out.println(e);
        }
    }


    public static void test() throws KettleException {
//        KettleEnvironment.init();
//        EnvUtil.environmentInit();
//        val transMeta = new TransMeta(fileName);
//        val trans = new Trans(transMeta);
//        trans.execute(null); // you can pass arguments instead of null
//        trans.waitUntilFinished();
//        if (trans.getErrors > 0) {
//            throw new RuntimeException("There were errors during transformation execution")
//        }
    }

}
