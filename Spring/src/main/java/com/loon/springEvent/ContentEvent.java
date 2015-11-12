package com.loon.springEvent;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Loon on 2015/11/12.
 */
public class ContentEvent extends ApplicationEvent {

    public ContentEvent(final String content) {
        super(content);
    }
}
