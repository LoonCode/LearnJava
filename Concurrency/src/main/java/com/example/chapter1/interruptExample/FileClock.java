package com.example.chapter1.interruptExample;

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

        /**
         * sleep响应interrupt的操作包括清除中断状态，抛出InterruptedException,
         * 一般说来，如果一个方法声明抛出InterruptedException，表示该方法是可中断的（没有在方法中处理中断却也声明
         * 抛出InterruptedException的除外），也就是说可中断方法会对interrupt调用做出响应（例如sleep响应interrupt的操作
         * 包括清除中断状态，抛出InterruptedException），如果interrupt调用是在可中断方法之前调用，可中断方法一定会处理
         * 中断，
         */
        TimeUnit.SECONDS.sleep(5);

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
