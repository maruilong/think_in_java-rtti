package com.shinian.typeinfo.demo;

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("类名:" + cc.getName() + "是否是接口:" + cc.isInterface());
        System.out.println("simple" + cc.getSimpleName());
        System.out.println(cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.shinian.typeinfo.demo.FactoryToy");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到");
            System.exit(1);
        }
        printInfo(c);

        Class up = c.getSuperclass();

        Object object = null;
        try {
            object = up.newInstance();
        } catch (Exception e) {

        }
        System.out.println(object.getClass());
    }
}

class FactoryToy extends Toy implements HasBatteries, Waterproof, Shoots {
    public FactoryToy() {
        super(1);
    }
}

class Toy {
    public Toy() {
    }

    public Toy(int i) {
    }
}

interface HasBatteries {

}

interface Waterproof {

}

interface Shoots {
}
