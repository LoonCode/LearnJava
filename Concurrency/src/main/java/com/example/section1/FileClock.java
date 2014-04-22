package com.example.section1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Loon on 2014/4/22.
 */
public class FileClock implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        FileClock fileClock = new FileClock();
        Thread thread = new Thread(fileClock);
        thread.start();

        TimeUnit.SECONDS.sleep(5);
        // todo:why？为什么当中断后，线程还在继续跑？
        thread.interrupt();

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s\n", new Date());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.printf("The FileClock has been interrupted");
            }
        }
    }
}
