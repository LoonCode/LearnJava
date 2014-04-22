package com.example.section2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Loon on 2014/4/22.
 */
public class BufferExample {

    public static void main(String[] args) throws IOException {

        RandomAccessFile aFile = new RandomAccessFile(FileChannelExample.class.getResource("/nio-data.txt").getFile(), "rw");
        FileChannel fileChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(48);
        int bytesRead = fileChannel.read(buf);

        buf.mark();
        //call buffer.get() a couple of times, e.g. during parsing.
        buf.reset();  //set position back to mark.

        while (bytesRead != -1) {

            buf.flip(); //make buffer ready for read

            while (buf.hasRemaining()) {
                System.out.print((char) buf.get());  // read 1 byte at a time
            }

            buf.clear();  //make buffer ready for writing
            bytesRead = fileChannel.read(buf);
        }
    }
}