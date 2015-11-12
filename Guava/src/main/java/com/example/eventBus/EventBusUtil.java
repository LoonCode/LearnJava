package com.example.eventBus;

import com.google.common.eventbus.EventBus;

/**
 * Created by Loon on 2014/8/18.
 */
public class EventBusUtil {

    public static final EventBus eventBus = new EventBus();

    public void fireEvent(Object listener, Object eventName) {

        eventBus.register(listener);
        eventBus.post(eventName);
    }

}
