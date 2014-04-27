package com.example.chapter1.threadGroupExceptionExample;

/**
 * Created by Loon on 2014/4/24.
 */
public class Main {
    public static void main(String[] args) {
        ThreadGroupException threadGroup = new ThreadGroupException("ThreadGroupException");
        Task task = new Task();
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(threadGroup, task);
            t.start();
        }

    }
}
