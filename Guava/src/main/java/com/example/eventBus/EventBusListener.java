package com.example.eventBus;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * Created by Loon on 2015/11/12.
 */
public class EventBusListener  {

    @Subscribe
    public void getMessage(String content) {
        System.out.println(content);
    }

}
