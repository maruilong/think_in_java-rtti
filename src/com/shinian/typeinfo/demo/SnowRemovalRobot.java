package com.shinian.typeinfo.demo;

import java.util.Arrays;
import java.util.List;

public class SnowRemovalRobot implements  Robot{

    private String name;

    public SnowRemovalRobot(String name) {
        this.name = name;
    }


    @Override
    public String name() {
        return name;
    }

    @Override
    public String model() {
        return "adsadsadsad";
    }

    @Override
    public List<Operation> operations() {

        return Arrays.asList(
                new Operation(){
                    @Override
                    public String desctiption() {
                        return name+"不能动";
                    }
                    @Override
                    public void command() {
                        System.out.println(name+"dsadsads");
                    }
                },new Operation(){
                    @Override
                    public String desctiption() {
                        return name+"不能动1";
                    }
                    @Override
                    public void command() {
                        System.out.println(name+"ddcxzcxcxzcxz");
                    }
                },new Operation(){
                    @Override
                    public String desctiption() {
                        return name+"不能动2";
                    }
                    @Override
                    public void command() {
                        System.out.println(name+"dsadsdsadsadsaads");
                    }
                }
        );
    }

    public static void main(String[] args) {
        Robot.Test.test(new SnowRemovalRobot("shinian"));
    }
}
