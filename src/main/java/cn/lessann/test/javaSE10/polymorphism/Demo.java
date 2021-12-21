package cn.lessann.test.javaSE10.polymorphism;

public class Demo {
    public static void getBark(Animal animal) {
        animal.bark();
    }

    public static void main(String[] args) {
        // 发出喵叫
        getBark(new Cat());

        // 发出狗叫
        getBark(new Dog());
    }
}
