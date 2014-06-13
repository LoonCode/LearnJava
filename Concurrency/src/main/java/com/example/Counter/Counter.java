package com.example.Counter;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Loon on 2014/6/13.
 */
public class Counter {

    private AtomicLong currentValue = new AtomicLong();   // 当前值
    private Long count; // 总数

    public Counter(Long count) {
        this.count = count;
    }

    public double getProgressValue() {
        return currentValue.get() / count;
    }

    public void plusOne() {
        currentValue.incrementAndGet();
    }
}
