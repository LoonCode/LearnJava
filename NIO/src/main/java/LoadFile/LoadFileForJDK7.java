package LoadFile;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Loon on 2014/12/12.
 */
public class LoadFileForJDK7 {

    public static void main(String[] args) throws Exception {

        Path listing = Paths.get("D:\\soft\\Java\\Apache\\apache-maven-3.1.1-bin.zip");

        System.out.println("File Name [" + listing.getFileName() + "]");
    }
}
