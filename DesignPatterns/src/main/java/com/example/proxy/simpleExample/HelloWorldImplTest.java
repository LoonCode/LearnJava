package com.example.proxy.simpleExample;


import java.lang.reflect.Proxy;

public class HelloWorldImplTest {

    public static void main(String[] args) {

        HelloWorld obj = new HelloWorldImpl();

        HelloWorldHandler handler = new HelloWorldHandler(obj);

//        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance( obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);

        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);

        proxy.sayHello();
    }
}