package com.example.proxy.simpleExample;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Loon on 2014/5/8.
 */
public class HelloWorldHandler implements InvocationHandler {

    private Object targetObject;

    public HelloWorldHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法调用前");

        Object result = method.invoke(this.targetObject, args);

        System.out.println("方法调用结束");

        return result;
    }
}
