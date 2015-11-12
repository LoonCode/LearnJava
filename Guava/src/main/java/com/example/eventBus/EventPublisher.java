package com.example.eventBus;

import com.google.common.eventbus.EventBus;

/**
 * Created by Loon on 2015/11/12.
 */
public class EventPublisher {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new EventBusListener());
        eventBus.post("test");
    }

}
