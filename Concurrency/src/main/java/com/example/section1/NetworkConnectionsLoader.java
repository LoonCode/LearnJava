package com.example.section1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Loon on 2014/4/22.
 */
public class NetworkConnectionsLoader implements Runnable {
    @Override
    public void run() {
        System.out.printf("Beginning netWork Connect loading: %s\n", new Date());
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("netWork Connect loading has finished:%s\n", new Date());
    }
}
