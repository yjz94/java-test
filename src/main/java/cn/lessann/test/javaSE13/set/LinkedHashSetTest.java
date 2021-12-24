package cn.lessann.test.javaSE13.set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<Dog> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Dog("旺财", 19));
        linkedHashSet.add(new Dog("小强", 20));

        for (Dog dog : linkedHashSet) {
            System.out.println(dog);
        }
    }
}
