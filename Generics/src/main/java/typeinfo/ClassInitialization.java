package typeinfo;

import java.util.Random;

/**
 * 类加载
 * 1.load class
 * 2.create ref
 * 3.init
 * Created by Loon on 2014/7/1.
 */

class Initable {
    static final int staticfinal = 1;
    static final int staticfinal2 = ClassInitialization.random.nextInt(100);

    static {
        System.out.println("inited1");
    }

}


class Initable2 {
    static int staticint = 2;

    static {
        System.out.println("inited2");
    }
}


class Initable3 {
    static int staticint = 3;

    static {
        System.out.println("inited3");
    }
}

public class ClassInitialization {
    public static Random random = new Random();

    public static void main(String[] args) throws ClassNotFoundException {

        /**
         * static  final 值是编译期常量  不需要经过初始化 可以直接使用
         */
        Class initable = Initable.class;
        System.out.println("after create ref");
        System.out.println(Initable.staticfinal);
        System.out.println(Initable.staticfinal2);

        System.out.println(Initable2.staticint);

        Class initable3 = Class.forName("typeinfo.Initable3");
        System.out.println("after create ref");
        System.out.println(Initable3.staticint);

    }
}
