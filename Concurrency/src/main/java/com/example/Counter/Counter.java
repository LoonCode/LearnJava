package com.example.Counter;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Loon on 2014/6/13.
 */
public class Counter {

    private static AtomicLong currentValue = new AtomicLong(0);   // 当前值
    private static Long count; // 总数

    public static void init(Long count) {
        Counter.currentValue = new AtomicLong(0);
        Counter.count = count;
        //System.out.println("===========" + currentValue);
    }


    /**
     * 获取当前进程值
     *
     * @return 进程值
     */
    public static double getProgressValue() {
        //System.out.println(currentValue + "+++++++++++" + count);
        return currentValue.doubleValue() / count.doubleValue();
    }

    /**
     * 对计数器进行加一
     */
    public static void plusOne() {
        currentValue.incrementAndGet();
    }

    public static void plusMany(long value) {
        currentValue.addAndGet(value);
    }
}
