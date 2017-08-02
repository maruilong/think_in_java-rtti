package com.shinian.typeinfo.demo;

public class GenericToyTest {

    public static void main(String[] args) throws  Exception {
        Class<FactoryToy> factoryToyClass=FactoryToy.class;
        FactoryToy factoryToy=factoryToyClass.newInstance();
        Class<? super FactoryToy> superclass = factoryToyClass.getSuperclass();
        Object object = superclass.newInstance();
        System.out.println(object.getClass());
    }

}
