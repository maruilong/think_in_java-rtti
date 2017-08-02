package com.shinian.typeinfo.demo;

public class ClassCasts {

    public static void main(String[] args) {
        Building building=new House();
        Class<House> houseClass=House.class;
        House house=houseClass.cast(building);
        System.out.println(house);
    }
}

class Building {
}

class House extends Building {
}
