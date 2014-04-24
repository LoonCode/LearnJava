package com.example.section1.localThreadVariables;

import java.util.concurrent.TimeUnit;

/**
 * Created by Loon on 2014/4/24.
 */
public class Main {

    public static void main(String[] args) {
        UnsafeTask task = new UnsafeTask();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(task);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
