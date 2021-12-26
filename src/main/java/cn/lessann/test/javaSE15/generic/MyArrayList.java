package cn.lessann.test.javaSE15.generic;

import java.util.ArrayList;

public class MyArrayList<T> {
    private ArrayList list = new ArrayList();

    public void add(T t) {
        list.add(t);
    }

    public void remove(T t) {
        list.remove(t);
    }
}
