package com.example.listener;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

/**
 * Created by loon on 16/5/19.
 */
public class RedisMessageListener implements MessageListener {


    public void onMessage(Message message, byte[] paramArrayOfByte) {
        System.out.println("Received by RedisMessageListener: " + message.toString());
    }
}