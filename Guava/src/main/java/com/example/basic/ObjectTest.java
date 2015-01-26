package com.example.basic;

import com.google.common.base.Objects;

/**
 * Created by Loong on 14-3-13.
 */
public class ObjectTest {

    private  String  name;
    private  String  age;

    public static void main(String[] args) {

        ObjectTest objectTest = new ObjectTest();
        objectTest.setAge("17");
        objectTest.setName("test");

        System.out.println(Objects.toStringHelper(objectTest).toString());


    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
