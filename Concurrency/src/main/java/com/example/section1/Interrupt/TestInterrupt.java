package com.example.section1.Interrupt;

/**
 * Created by Loon on 2014/4/23.
 * sources:http://blog.csdn.net/vernonzheng/article/details/8249577
 */
public class TestInterrupt {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        System.out.println(" Thread  Status :" + myThread.isInterrupted());
    }

    static class MyThread extends Thread {
        private static int longTimeRunningNonInterruptMethod(int count, int initNum) {
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < Integer.MAX_VALUE; j++) {
                    initNum++;
                }
            }
            return initNum;
        }

        public void run() {
            int num = longTimeRunningNonInterruptMethod(2, 0);
            System.out.println("长时间任务运行结束,num=" + num);
            System.out.println("线程的中断状态:" + Thread.interrupted());
        }
    }
}
