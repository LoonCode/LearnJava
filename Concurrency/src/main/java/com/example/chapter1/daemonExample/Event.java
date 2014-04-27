package com.example.chapter1.daemonExample;

import java.util.Date;

/**
 * Created by Loon on 2014/4/23.
 */
public class Event {

    protected Date date;
    private String event;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
