import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created with IntelliJ IDEA.
 * User: Loong
 * Date: 13-11-23
 * Time: 下午10:31
 * To change this template use File | Settings | File Templates.
 */
public class Channle {

    public static void main(String[] args) throws IOException, URISyntaxException {

        // get random file

        File file = new File(new URL(Thread.currentThread().getContextClassLoader().getResource("") + "nio-data.txt").toURI());

        RandomAccessFile aFile = new RandomAccessFile(file, "rw");
        // get channel
        FileChannel inChannel = aFile.getChannel();

        //create buffer with capacity of 48 bytes
        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf); //read into buffer.
        while (bytesRead != -1) {

            buf.flip();  //make buffer ready for read

            while(buf.hasRemaining()){
                System.out.print((char) buf.get()); // read 1 byte at a time
            }

            buf.clear(); //make buffer ready for writing
            bytesRead = inChannel.read(buf);
        }
        aFile.close();

    }
}
