package com.shinian.typeinfo.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {

    public static void consumer(InterFace interFace) {
        interFace.doSomeThing();
        interFace.someThingElse("shinib");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        consumer(realObject);
        InterFace proxyInterFact = (InterFace) Proxy.newProxyInstance(InterFace.class.getClassLoader(), new Class[]{InterFace.class}, new DynamicProxyHandler(realObject));
        consumer(proxyInterFact);
    }


}


class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理了");
        return method.invoke(proxied, args);
    }

    public DynamicProxyHandler(Object proxy) {
        this.proxied = proxy;
    }
}
