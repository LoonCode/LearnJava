package com.example.chapter1.threadFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Loon on 2014/4/24.
 */
public class Task implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
