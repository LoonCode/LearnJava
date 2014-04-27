package com.example.chapter1.threadFactory;

/**
 * Created by Loon on 2014/4/24.
 *
 * @link http://ifeve.com/thread-management-13/
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
