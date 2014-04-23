package com.example.section1.cancelTask;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by Loon on 2014/4/23.
 *
 * @link http://ifeve.com/thread-executors-9/
 */
public class Task implements Callable<String> {
    @Override
    public String call() throws Exception {
        while (true) {
            System.out.printf("Task: Test\n");
            TimeUnit.MILLISECONDS.sleep(100);
        }
    }
}
