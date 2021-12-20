package cn.lessann.test.javaSE07;

public class ClassTest1 {
    public static void main(String[] args) {
        User user = new User();
        user.name = "张三";
        user.age = 18;

        System.out.println(user.name);
        user.sleep();
    }
}
