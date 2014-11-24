package com.example.chapter2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

/**
 * Created by Loon on 2014/11/24.
 */
public class DatagramChannelClientExample {

    public static void main(String[] args) throws IOException {
        DatagramChannel channel = DatagramChannel.open();

        String newData = "New String to write to file..." + System.currentTimeMillis();

        ByteBuffer buf = ByteBuffer.allocate(48);
        buf.clear();
        buf.put(newData.getBytes());
        buf.flip();

        channel.send(buf, new InetSocketAddress("127.0.0.1", 9999));
        channel.close();
    }
}
