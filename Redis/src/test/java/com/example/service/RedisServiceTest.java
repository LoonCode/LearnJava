package com.example.service;

import com.example.config.AppConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by loon on 16/5/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class RedisServiceTest {

    @Autowired
    private RedisService redisService;


    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


        System.out.println("message: " + redisService.getValue("key"));
        Thread.sleep(1000 * 6);
        System.out.println("message: " + redisService.getValue("key"));
    }


    @Test
    public void getValue() throws Exception {

    }

    @Test
    public void setValue() throws Exception {
        redisService.setValue("key", "hello world!");
    }


    @Test
    public void publish() throws Exception {
        redisService.publish("test notify");
    }

}