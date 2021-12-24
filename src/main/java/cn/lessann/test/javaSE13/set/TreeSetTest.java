package cn.lessann.test.javaSE13.set;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        // 创建TreeSet需要实现排序方法，这里是倒序排列
        TreeSet<Dog> treeSet = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());

        treeSet.add(new Dog("张三", 20));
        treeSet.add(new Dog("李四", 18));
        treeSet.add(new Dog("王二", 19));

        for (Dog dog : treeSet) {
            System.out.println(dog);
        }
    }
}
