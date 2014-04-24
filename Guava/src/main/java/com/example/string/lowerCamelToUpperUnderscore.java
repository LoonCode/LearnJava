package com.example.string;

import com.google.common.base.CaseFormat;


public class lowerCamelToUpperUnderscore {

    public static void main(String[] args) {
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, "lowerCamel"));
    }
}
