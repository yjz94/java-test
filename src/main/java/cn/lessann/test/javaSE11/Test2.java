package cn.lessann.test.javaSE11;

public class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("A",18,"男");
        Student student2 = new Student("B",20,"女");
        Student student3 = new Student("B",20,"女");

        System.out.println(student1==student2);
        System.out.println(student2==student3);
        System.out.println(student1.equals(student2));
        System.out.println(student2.equals(student3));
    }
}
