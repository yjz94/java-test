package cn.lessann.test.javaSE15.generic;

import java.util.Collection;

public class GenericImpl<E> {
    public void getSize(Collection<? extends E> collection) {
        System.out.println(collection.size());
    }
}
