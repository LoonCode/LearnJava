package com.example.Counter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Loon on 2014/6/12.
 */

public class CountTest {

    public static void main(String[] args) throws InterruptedException {

        final Count counter = new Count();

        // create 1000 threads
        ArrayList<MyThread> threads = new ArrayList<MyThread>();
        for (int x = 0; x < 1000; x++) {
            threads.add(new MyThread(counter));
        }

        // start all of the threads
        Iterator i1 = threads.iterator();
        while (i1.hasNext()) {
            MyThread mt = (MyThread) i1.next();
            mt.start();
        }

        // wait for all the threads to finish
        Iterator i2 = threads.iterator();
        while (i2.hasNext()) {
            MyThread mt = (MyThread) i2.next();
            mt.join();
        }

        System.out.println("Count: " + counter.getCount());
    }
}

// thread that increments the counter 100000 times.
class MyThread extends Thread {
    Count counter;

    MyThread(Count counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter.incrementCount();
    }
}

// class that uses AtomicInteger for counter
class Count {

    private AtomicInteger count = new AtomicInteger(0);

    public void incrementCount() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}
