package com.example.singleton;

/**
 * Created by Loon on 2014/4/23.
 *
 * @link http://www.cnblogs.com/zuoxiaolong/p/3263085.html
 */
public class SingletonExample {

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        return SingletonInstance.instance;
    }

    private static class SingletonInstance {
        static SingletonExample instance = new SingletonExample();
    }
}
