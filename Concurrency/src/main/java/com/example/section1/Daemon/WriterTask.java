package com.example.section1.Daemon;

import java.util.Deque;

/**
 * Created by Loon on 2014/4/23.
 */
public class WriterTask implements Runnable {

    private Deque<Event> deque;

    public WriterTask(Deque<Event> deque) {
        this.deque = deque;
    }

    @Override
    public void run() {

    }
}
