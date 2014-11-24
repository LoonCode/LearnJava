package com.example.chapter2;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Loon on 2014/10/23.
 */
public class SelectorExample {

    public static void main(String[] args) throws IOException {

        SocketChannel socketChannel = SocketChannel.open();
        Selector selector = Selector.open();

        socketChannel.configureBlocking(false);// 设置为非阻塞
        socketChannel.register(selector, SelectionKey.OP_READ);


//         todo: 下边的需要进一步理解
        while (true) {
            int readyChannels = selector.select();
            if (readyChannels == 0) continue;
            Set selectedKeys = selector.selectedKeys();
            Iterator keyIterator = selectedKeys.iterator();
            while (keyIterator.hasNext()) {
                SelectionKey key = (SelectionKey) keyIterator.next();
                if (key.isAcceptable()) {
                    System.out.println("a connection was accepted by a ServerSocketChannel.");
                    // a connection was accepted by a ServerSocketChannel.
                } else if (key.isConnectable()) {
                    System.out.println("a connection was established with a remote server.");
                    // a connection was established with a remote server.
                } else if (key.isReadable()) {
                    System.out.println("a channel is ready for reading");
                    // a channel is ready for reading
                } else if (key.isWritable()) {
                    System.out.println("a channel is ready for writing");
                    // a channel is ready for writing
                }
                keyIterator.remove();
            }
        }
    }
}
