package com.example.chapter1;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.common.io.Resources;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by Loon on 2014/4/22.
 */
public class ThreadStatus implements Runnable {

    private int number;

    public ThreadStatus(int number) {
        this.number = number;
    }

    public static void main(String[] args) throws URISyntaxException, IOException {

        Thread threads[] = new Thread[10];
        Thread.State status[] = new Thread.State[10];

        URL url = Resources.getResource("nio-data.txt");
        File file = new File(url.getFile());

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new ThreadStatus(i));
            if ((i % 2) == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("Thread " + i);
            fileAppend(file, "Main : Status of Thread " + i + " : " + threads[i].getState() + System.getProperty("line.separator"));
            status[i] = threads[i].getState();
        }

        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }


        boolean finish = false;
        while (!finish) {
            for (int i = 0; i < 10; i++) {
                if (threads[i].getState() != status[i]) {
                    writeThreadInfo(file, threads[i], status[i]);
                    status[i] = threads[i].getState();
                }
            }

            finish = true;
            for (int i = 0; i < 10; i++) {
                finish = finish && (threads[i].getState() == Thread.State.TERMINATED);
            }
        }

    }

    private static void writeThreadInfo(File file, Thread thread, Thread.State state) throws IOException {

        //  使用    StandardSystemProperty.LINE_SEPARATOR 出错
        fileAppend(file, String.format("Main : Id %d - %s", thread.getId(), thread.getName()) + System.getProperty("line.separator"));
        fileAppend(file, String.format("Main : Priority: %d", thread.getPriority()) + System.getProperty("line.separator"));
        fileAppend(file, String.format("Main : Old State: %s", state) + System.getProperty("line.separator"));
        fileAppend(file, String.format("Main : New State: %s", thread.getState()) + System.getProperty("line.separator"));
        fileAppend(file, "Main : ************************************" + System.getProperty("line.separator"));
    }

    private static void fileAppend(File file, String context) throws IOException {
        Files.append(context, file, Charsets.UTF_8);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(), number, i, i * number);
        }
    }
}
