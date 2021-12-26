package cn.lessann.test.javaSE15.generic;

public class MyInterfaceImpl<E> implements MyInterface<E> {
    @Override
    public void println(E e) {
        System.out.println(e);
    }
}
