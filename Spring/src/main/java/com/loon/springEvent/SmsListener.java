package com.loon.springEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Loon on 2015/11/12.
 */
@Component
public class SmsListener implements ApplicationListener<ApplicationEvent> {

    public void onApplicationEvent(ApplicationEvent applicationEvent) {


        if(applicationEvent instanceof ContentEvent) {
            System.out.println("李四收到了新的内容：" + applicationEvent.getSource());
        }
    }
}
