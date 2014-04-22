package com.example.section1;

/**
 * Created by Loon on 2014/4/22.
 */
public class ThreadInterruptedExample extends Thread {

    public static void main(String[] args) {
        Thread thread = new ThreadInterruptedExample();
        thread.start();
        System.out.println(thread.isInterrupted());
        thread.interrupt();
        System.out.println(thread.isInterrupted());
    }

    @Override
    public void run() {
        System.out.println(System.currentTimeMillis());
    }
}
