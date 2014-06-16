package com.example.Counter;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class CounterTest {


    public static void main(String[] args) {

        Counter.init(Long.valueOf(100));

        ExecutorService executor = Executors.newFixedThreadPool(1000);


        executor.execute(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("count  " + Counter.getProgressValue());
                }
            }
        });

        for (int i = 0; i < 10; i++) {

            executor.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        try {
                            TimeUnit.SECONDS.sleep(1);
                            Counter.plusOne();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

        }


        executor.shutdown();
        System.out.printf("count  " + Counter.getProgressValue());


    }


}