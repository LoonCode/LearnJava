package com.example.check;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

/**
 * Created by loon on 16/5/19.
 */
public class CheckRedis {


    public static void main(String[] args) {


        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("192.168.99.100", 32768);
        System.out.println("Connection to server sucessfully");
        //check whether server is running or not
        System.out.println("Server is running: " + jedis.ping());

        //set the data in redis string
        jedis.set("tutorial-name", "Redis tutorial");
        // Get the stored data and print it
        System.out.println("Stored string in redis:: " + jedis.get("tutorial-name"));


        //store data in redis list
        jedis.lpush("tutorial-list", "Redis");
        jedis.lpush("tutorial-list", "Mongodb");
        jedis.lpush("tutorial-list", "Mysql");
        // Get the stored data and print it
        List<String> list = jedis.lrange("tutorial-list", 0, 5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Stored string in redis:: " + list.get(i));
        }


        Set<String> keyList = jedis.keys("*");
        for (String key : keyList) {
            System.out.println("keyList of stored keys:: " + key);
        }


    }
}
