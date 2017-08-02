package com.shinian.typeinfo.demo;

import java.util.ArrayList;
import java.util.List;

/***
 * 如果你newInstance的对象没有一个默认的无参构造器,那么会出现异常 并且编译器也不会对这件事情产生任何警告信息
 * @param <T>
 */
public class FilledList<T> {


    public static void main(String[] args) {
        FilledList<CountedInteger> list = new FilledList<>(CountedInteger.class);
        System.out.println(list.create(10));
    }


    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElements) {
        List<T> result = new ArrayList<>();
        try {
            for (int i = 0; i < nElements; i++) {
                result.add(type.newInstance());
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }
}


class CountedInteger {

    private static long counter;

    private final long id = counter++;

    @Override
    public String toString() {
        return "CountedInteger{" +
                "id=" + id +
                '}';
    }
}
