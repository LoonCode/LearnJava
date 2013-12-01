import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
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

    public static void main(String[] args) throws IOException {

        // get random file
        RandomAccessFile aFile = new RandomAccessFile("D:\\Users\\Loong\\Test\\nio_data.txt", "rw");
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
