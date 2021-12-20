package cn.lessann.test.javaSE08;

public class Student {
    // 定义静态方法
    public static void task() {
        System.out.println("所有学生的任务是学习");
    }
    // 定义实例方法
    public void sleep() {
        System.out.println("每个学生的睡姿都有自己的独特性");
    }

    public static void main(String[] args) {
        // 直接调用静态方法
        Student.task();
        // 调用实例方法
        Student student = new Student();
        student.sleep();
    }
}
