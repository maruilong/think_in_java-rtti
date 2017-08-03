package com.shinian.typeinfo.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.List;

/***
 *
 */
public class NullRobot {

    public static void main(String[] args) {
        Robot[] robots = {
                new SnowRemovalRobot("扫雷"),
                newNullRobot(SnowRemovalRobot.class)
        };
        for (Robot bot : robots) {
            Robot.Test.test(bot);
        }
    }


    public static Robot newNullRobot(Class<? extends Robot> type) {
        return (Robot) Proxy.newProxyInstance(
                NullRobot.class.getClassLoader(),
                new Class[]{Null.class, Robot.class},
                new NullRobotProxyHandler(type)
        );
    }
}


class NullRobotProxyHandler implements InvocationHandler {
    private String nullName;
    private Robot proxied = new NRobot();

    public NullRobotProxyHandler(Class<? extends Robot> type) {
        nullName=type.getSimpleName()+ " NullRobot";
    }

    private class NRobot implements Robot, Null {
        @Override
        public String name() {
            return nullName;
        }

        @Override
        public String model() {
            return nullName;
        }

        @Override
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied, args);
    }

}
