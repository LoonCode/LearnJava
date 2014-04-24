package com.example.section1.threadFactory;

/**
 * Created by Loon on 2014/4/24.
 */
public class Main {
    public static void main(String[] args) {
        ThreadFactoryExample factory = new ThreadFactoryExample("ThreadFactoryExample");
        Task task = new Task();

        Thread thread;
        System.out.printf("Starting the Threads\n");
        for (int i = 0; i < 10; i++) {
            thread = factory.newThread(task);
            thread.start();
        }

        System.out.printf("Factory stats:\n");
        System.out.printf("%s\n", factory.getStats());

    }
}
