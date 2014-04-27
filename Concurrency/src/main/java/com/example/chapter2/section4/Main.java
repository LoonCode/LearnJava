package com.example.chapter2.section4;

/**
 * Created by Loon on 2014/4/27.
 * 基于synchronized关键字和wait()和notify(),notifyAll()方法实现生产者消费者问题
 */
public class Main {

    public static void main(String[] args) {
        EventStorage storage = new EventStorage();

        Producer producer = new Producer(storage);
        Thread thread1 = new Thread(producer);

        Consumer consumer = new Consumer(storage);
        Thread thread2 = new Thread(consumer);

        thread2.start();
        thread1.start();
    }
}
