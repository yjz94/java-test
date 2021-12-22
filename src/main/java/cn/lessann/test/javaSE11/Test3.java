package cn.lessann.test.javaSE11;

import java.util.Objects;

public class Test3 {
    public static void main(String[] args) {
        Student student1 = new Student("A",18,"男");
        Student student2 = new Student("B",20,"女");
        Student student3 = new Student("B", 20, "女");

        System.out.println(Objects.equals(student1, student2));
        System.out.println(Objects.equals(student2, student3));
    }
}
