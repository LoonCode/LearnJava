package com.loon.springEvent.orderExample;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Loon on 2015/11/12.
 */
@Component
public class OrderEventListener2 implements ApplicationListener<OrderEvent> {

    public void onApplicationEvent(OrderEvent orderEvent) {

        System.out.println("收到了新的内容222：" + ((Order)orderEvent.getSource()).getCreateTime());
    }
}
