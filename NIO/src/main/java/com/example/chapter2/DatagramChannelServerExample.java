package com.example.chapter2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

/**
 * Created by Loon on 2014/11/24.
 */
public class DatagramChannelServerExample {

    public static void main(String[] args) throws IOException, InterruptedException {

        DatagramChannel channel = DatagramChannel.open();
        channel.socket().bind(new InetSocketAddress(9999));
        channel.configureBlocking(false);

        ByteBuffer buf = ByteBuffer.allocate(48);
        while (channel.receive(buf) == null) {
            //buf.clear();
            TimeUnit.SECONDS.sleep(1);
        }

        buf.flip(); // 此处需要反转
        String recStr = Charset.forName("utf-8").newDecoder().decode(buf).toString();
        System.out.println(recStr);

        channel.close();

    }
}
