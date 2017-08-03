package com.shinian.typeinfo.demo;

interface Null {

}

public class Person {
    public final String first;
    public final String last;
    public final String address;

    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static final Person NULL=new NullPersion();

    public static class NullPersion extends Person implements Null {
        private NullPersion(){
            super("None","None","None");
        }

        @Override
        public String toString() {
            return "NullPersion{}";
        }

    }

}

