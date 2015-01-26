package com.example.basic;

import com.google.common.base.CaseFormat;

/**
 * 小写驼峰转换为大写下划线
 */
public class lowerCamelToUpperUnderscore {

    public static void main(String[] args) {
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, "lowerCamel"));
    }
}
