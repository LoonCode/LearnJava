package com.loon.springEvent.orderExample;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Loon on 2015/11/12.
 */
public class OrderEvent extends ApplicationEvent {

    public OrderEvent(Order source) {
        super(source);
    }
}
