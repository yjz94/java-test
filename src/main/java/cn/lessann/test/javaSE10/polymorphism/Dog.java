package cn.lessann.test.javaSE10.polymorphism;

public class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("小狗发出汪汪汪叫声。。。");
    }
}
