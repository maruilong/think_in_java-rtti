package com.shinian.typeinfo.demo;

import java.util.List;

public interface Robot {

    String name();

    String model();

    List<Operation> operations();

    class Test {
        public static void test(Robot robot) {
            if (robot instanceof Null) {
                System.out.println("null robot");
            }
            System.out.println(robot.name());
            System.out.println(robot.model());
            for (Operation operation : robot.operations()) {
                System.out.println(operation.desctiption());
                operation.command();
            }
        }
    }

}

