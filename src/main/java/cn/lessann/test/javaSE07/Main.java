package cn.lessann.test.javaSE07;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("张三", 20, "男");

        Student student1 = new Student();
        student1.setName("李四");
        student1.setAge(18);
        student1.setSex("nv");
    }
}
