package com.example.basic;

import com.google.common.collect.Lists;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by Loon on 2015/1/26.
 */
public class PreconditionsExample {

    public static void main(String[] args) {

        List<String> stringList = Lists.newArrayList(null, "test");

        for (String s : stringList) {
            System.out.println(s);
        }

        List<String> stringList1 = Lists.newArrayList();

        checkNotNull(stringList1);

        for (String s : stringList1) {
            System.out.println(s);
        }


    }

}
