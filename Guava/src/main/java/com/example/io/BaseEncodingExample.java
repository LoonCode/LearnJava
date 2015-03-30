package com.example.io;

import com.google.common.io.BaseEncoding;

import java.nio.charset.Charset;

/**
 * Created by Loon on 2015/3/30.
 */
public class BaseEncodingExample {

    public static void main(String[] args) {

        String str=BaseEncoding.base64().encode("test".getBytes(Charset.defaultCharset()));
        System.out.println(str);
        System.out.println( new String(BaseEncoding.base64().decode(str),Charset.defaultCharset()));

    }
}
