package com.example.section2.synchroinzation;

/**
 * Created by Loon on 2014/4/27.
 */
public class JoinTest implements Runnable {

    private static int sum = 0;

    public static void main(String[] args) {


        Thread thread = new Thread(new JoinTest());
        thread.start();
        try {
            thread.join(); // 先执行子线程，再执行主线程MAIN方法。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sum);

    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            sum++;
        }
    }
}
