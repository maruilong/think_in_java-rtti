package com.shinian.typeinfo.demo;

import java.util.Random;

public class ClassInitializetion {

    public static Random random = new Random();

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Initable.class;
        System.out.println("initable 初始化成功!");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class<?> class1 = Class.forName("com.shinian.typeinfo.demo.Initable3");
        System.out.println("3创建完");
        System.out.println(Initable3.staticNonFinal);

    }
}

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitializetion.random.nextInt(1000);
    static {
        System.out.println("初始化 Initable");
    }
}

class Initable2 {
    static final int staticNonFinal = 147;
    static {
        System.out.println("初始化 Initable2");
    }
}

class Initable3 {
    static final int staticNonFinal = 74;
    static {
        System.out.println("初始化 Initable3");
    }
}
