package com.shinian.typeinfo.demo;

public class SimpleProxyDemo {

    public static void consumer(InterFace interFace) {
        interFace.doSomeThing();
        interFace.someThingElse("shinib");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy());
    }

}


interface InterFace {
    void doSomeThing();

    void someThingElse(String arg);
}

class RealObject implements InterFace {

    @Override
    public void doSomeThing() {
        System.out.println("doSomeThing");
    }

    @Override
    public void someThingElse(String arg) {
        System.out.println(arg);
    }
}

class SimpleProxy implements InterFace {

    private RealObject realObject=new RealObject();

    @Override
    public void doSomeThing() {
        System.out.println("代理啊");
        realObject.doSomeThing();
    }

    @Override
    public void someThingElse(String arg) {
        System.out.println("代理啊");
        realObject.someThingElse("shinian");
    }
}

