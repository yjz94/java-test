package cn.lessann.test.javaSE10.polymorphism;

public class Cat implements Animal{
    @Override
    public void bark() {
        System.out.println("小猫发出喵喵叫声。。。");
    }
}
