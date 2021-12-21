package cn.lessann.test.javaSE10.innerclass;

public class PartialInnerClass {
    {
        class Dog{
        }

        Dog dog = new Dog();
    }

    public PartialInnerClass() {
        class Cat{
        }
        Cat cat = new Cat();
    }

    public static void main(String[] args) {
        class Pig{
        }
        Pig pig = new Pig();
    }
}
