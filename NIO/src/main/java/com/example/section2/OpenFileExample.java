package com.example.section2;


import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.common.io.Resources;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class OpenFileExample {

    /**
     * @param url 文件Url
     * @throws URISyntaxException
     * @throws IOException
     */
    public static void openFileForURL(URL url) throws URISyntaxException, IOException {
        File file = new File(url.toURI());
        System.out.println(Files.readFirstLine(file, Charsets.UTF_8));
    }

    /**
     *
     * @param path 文件路径
     * @throws URISyntaxException
     * @throws IOException
     */
    public static void openFileForPath(String path) throws URISyntaxException, IOException {
        File file = new File(path);
        System.out.println(Files.readFirstLine(file, Charsets.UTF_8));
    }


    public static void main(String[] args) throws URISyntaxException, IOException {
        URL url = Resources.getResource("nio-data.txt");
        openFileForURL(url);
        openFileForURL(OpenFileExample.class.getResource("/nio-data.txt"));

        openFileForPath(OpenFileExample.class.getResource("/nio-data.txt").getFile());
    }
}
