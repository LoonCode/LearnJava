package com.loon.springEvent.orderExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Created by Loon on 2015/11/12.
 */
@Component
public class OrderService {

    @Autowired
    private ApplicationEventPublisher publisher;

    public void createOrder(Order order) {
        this.publisher.publishEvent(new OrderEvent(order));
    }
}
