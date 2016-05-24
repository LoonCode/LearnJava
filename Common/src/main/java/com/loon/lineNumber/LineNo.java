package com.loon.lineNumber;

/**
 * 获取文件名称，行号
 *
 * @link http://www.coolside.cn/?p=59
 * Created by Loon on 2014/11/25.
 */
public class LineNo {

    public static int getLineNumber() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static String getFileName() {
        return Thread.currentThread().getStackTrace()[2].getFileName();
    }

    public static void main(String args[]) {
        System.out.println("[" + getFileName() + "：" + getLineNumber() + "]" + "Hello World!");
    }
}
