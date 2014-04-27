package com.example.chapter1.threadGroupExceptionExample;

/**
 * Created by Loon on 2014/4/24.
 */
public class ThreadGroupException extends ThreadGroup {

    public ThreadGroupException(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("The thread %s has thrown an Exception\n", t.getId());
        e.printStackTrace(System.out);
        System.out.printf("Terminating the rest of the Threads\n");
        interrupt();
    }
}
