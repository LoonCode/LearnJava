package com.loon.springEvent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Loon on 2015/11/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class EventTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testPublishEvent() {
        applicationContext.publishEvent(new ContentEvent("Test"));
    }
}
