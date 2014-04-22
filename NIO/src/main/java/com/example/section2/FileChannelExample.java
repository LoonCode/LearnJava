package com.example.section2;


import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.common.io.Resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

public class FileChannelExample {

    public static void main(String[] args) throws IOException, URISyntaxException {

        URL url = Resources.getResource("nio-data.txt");

        File file = new File(url.toURI());

//        RandomAccessFile aFile = new RandomAccessFile(url.toURI(), "rw");
//        FileChannel inChannel = aFile.getChannel();
//
//        ByteBuffer buf = ByteBuffer.allocate(48);
//
//        int bytesRead = inChannel.read(buf);
//        while (bytesRead != -1) {
//
//            System.out.println("Read " + bytesRead);
//            buf.flip();
//
//            while(buf.hasRemaining()){
//                System.out.print((char) buf.get());
//            }
//
//            buf.clear();
//            bytesRead = inChannel.read(buf);
//        }
//        aFile.close();
    }

}
