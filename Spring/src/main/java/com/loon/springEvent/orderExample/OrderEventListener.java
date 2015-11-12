package com.loon.springEvent.orderExample;

import com.loon.springEvent.ContentEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Loon on 2015/11/12.
 */
@Component
public class OrderEventListener implements ApplicationListener<OrderEvent> {

    public void onApplicationEvent(OrderEvent orderEvent) {

        System.out.println("李四收到了新的内容：" + ((Order)orderEvent.getSource()).getCreateTime());
    }
}
