package com.shinian.typeinfo.demo;

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("candy 创建");
        try {
            Class.forName("com.shinian.typeinfo.demo.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到gum");
        }
        new Cookie();
        System.out.println("after new Cookie");

    }
}

class Candy {
    static {
        System.out.println("loding Candy");
    }
}

class Gum {
    static {
        System.out.println("logding Gum");
    }
}

class Cookie {
    static {
        System.out.println("loding Cookie");
    }
}