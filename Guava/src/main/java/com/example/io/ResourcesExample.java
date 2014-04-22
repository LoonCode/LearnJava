package com.example.io;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.util.List;


public class ResourcesExample {

    public static void main(String[] args) throws IOException {
        URL url = Resources.getResource("nio-data.txt");
        List<String> stringList = Resources.readLines(url, Charsets.UTF_8);
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
