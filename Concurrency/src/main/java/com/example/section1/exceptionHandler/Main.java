package com.example.section1.exceptionHandler;

/**
 * Created by Loon on 2014/4/23.
 * <p/>
 * The Thread 类有其他相关方法可以处理未捕获的异常。静态方法 setDefaultUncaughtExceptionHandler()
 * 为应用里的所有线程对象建立异常 handler 。当一个未捕捉的异常在线程里被抛出，JVM会寻找此异常的3种可能
 * 潜在的处理者（handler）。
 * <p/>
 * 首先, 它寻找这个未捕捉的线程对象的异常handle，如我们在在这个指南中学习的。
 * 如果这个handle 不存在，那么JVM会在线程对象的ThreadGroup里寻找非捕捉异常的handler，
 * 如在处理线程组内的不受控制异常里介绍的那样。如果此方法不存在，正如我们在这个指南中学习的，那么 JVM 会寻找默认非捕捉异常handle。
 * <p/>
 * 如果没有一个handler存在, 那么 JVM会把异常的 stack trace 写入操控台并结束任务。
 *
 * @link http://ifeve.com/thread-management-9/
 */
public class Main {

    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.setUncaughtExceptionHandler(new ExceptionHandler()); // 设置异常的处理程序
        thread.start();
    }
}
