package com.example.chapter1.interruptExample;

import java.util.concurrent.TimeUnit;

/**
 * Created by Loon on 2014/4/23.
 *
 * @link http://blog.csdn.net/vernonzheng/article/details/8249577
 */
public class TestInterrupt2 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        t.interrupt();
        System.out.println("已调用线程的interrupt方法");
    }

    static class MyThread extends Thread {
        private static int longTimeRunningInterruptMethod(int count, int initNum) throws InterruptedException {
            for (int i = 0; i < count; i++) {
                TimeUnit.SECONDS.sleep(5);
            }
            return initNum;
        }

        public void run() {
            int num = -1;
            try {
                num = longTimeRunningInterruptMethod(2, 0);
            } catch (InterruptedException e) {
                System.out.println("线程被中断");
                throw new RuntimeException(e);
            }
            System.out.println("长时间任务运行结束,num=" + num);
            System.out.println("线程的中断状态:" + Thread.interrupted());
        }
    }
}
