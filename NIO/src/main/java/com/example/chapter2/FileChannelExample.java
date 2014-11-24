package com.example.chapter2;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * FileChannel 写入，读取，写入特定位置，截取
 * @link http://ifeve.com/file-channel/
 */
public class FileChannelExample {

    public static void main(String[] args) throws IOException, URISyntaxException {

        // Opening a FileChannel,Before you can use a FileChannel you must open it.
        // You cannot open a FileChannel directly. You need to obtain a FileChannel via an InputStream,
        // OutputStream, or a RandomAccessFile. Here is how you open a FileChannel via a RandomAccessFile:
        RandomAccessFile aFile = new RandomAccessFile(FileChannelExample.class.getResource("/nio-data.txt").getFile(), "rw");
        FileChannel inChannel = aFile.getChannel();

        // 以下无法同时执行
//        writeDataToFileChannel(inChannel, "test");
//        readDataToFileChannel(inChannel);
//        writeDataToFileChannel(inChannel, "1", 2);


//        inChannel.truncate(2);  // 截取文件流？
        inChannel.force(true);  // 将文件数据和元数据强制写到磁盘上

        //  When you are done using a FileChannel you must close it.
        inChannel.close();
        aFile.close();

    }

    // 写入数据
    public static void writeDataToFileChannel(FileChannel fileChannel, String context) throws IOException {

        //  create buffer with capacity of 48 bytes
        ByteBuffer buf = ByteBuffer.allocate(48);
        buf.clear();
        buf.put(context.getBytes());

        buf.flip();

        while (buf.hasRemaining()) {
            fileChannel.write(buf);
        }
    }

    // 读取数据
    public static void readDataToFileChannel(FileChannel fileChannel) throws IOException {

        //  First a Buffer is allocated. The data read from the FileChannel is read into the Buffer.
        ByteBuffer buf = ByteBuffer.allocate(48);   //  create buffer with capacity of 48 bytes

        //  Second the FileChannel.read() method is called. This method reads data from the FileChannel into theBuffer.
        // The int returned by the read() method tells how many bytes were witten into the Buffer. If -1 is returned,
        // the end-of-file is reached.
        int bytesRead = fileChannel.read(buf);  // read into buffer.
        while (bytesRead != -1) {

            System.out.println("Read " + bytesRead);
            buf.flip(); //make buffer ready for read

            while (buf.hasRemaining()) {
                System.out.print((char) buf.get());  // read 1 byte at a time
            }

            buf.clear();  //make buffer ready for writing
            bytesRead = fileChannel.read(buf);
        }

    }


    // 写入数据到指定位置
    public static void writeDataToFileChannel(FileChannel fileChannel, String context, long position) throws IOException {

        long pos = fileChannel.position();

        fileChannel.position(position);

        ByteBuffer buf = ByteBuffer.allocate(48);
        buf.clear();
        buf.put(context.getBytes());

        buf.flip();

        while (buf.hasRemaining()) {
            fileChannel.write(buf);
        }
    }

}
