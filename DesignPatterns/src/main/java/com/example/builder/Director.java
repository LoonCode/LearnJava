package com.example.builder;

/**
 * Created by Loon on 2014/7/14.
 */
public class Director {

    private Builder builder;

    public Director(Builder b) {
        builder = b;
    }

    public void convert(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0)
                builder.buildPartA(string.charAt(i));
            else
                builder.buildPartB(string.charAt(i));
        }
    }
}
