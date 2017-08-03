package com.shinian.typeinfo.demo;

import java.util.ArrayList;

public class Staff extends ArrayList<Position> {

    public static void main(String[] args) {
        Staff staff=new Staff("shinian","maruilong","nibababa");//工作
        staff.fillPosition("shinian",new Person("me","last","luoyang"));//雇佣一个人
        if (staff.positionAvailable("maruilong")){
            staff.fillPosition("maruilong",new Person("bob","coder","aadsdsadsa"));
        }//如果maruilong这个位置是null的
        System.out.println(staff);
    }



    public boolean add(String title, Person person) {
        return add(new Position(title, person));
    }

    public void add(String... titles) {
        for (String title : titles) {
            add(new Position(title));
        }
    }

    public Staff(String... titles) {
        add(titles);
    }

    public boolean positionAvailable(String title) {
        for (Position position : this) {
            if (position.getTitle().equals(title) && position.getPerson() == Person.NULL) {
                return true;
            }
        }
        return false;
    }

    public void fillPosition(String title,Person hire){
        for (Position position : this) {
            if (position.getTitle().equals(title) && position.getPerson() == Person.NULL) {
                position.setPerson(hire);
                return;
            }
        }

    }



}
