package cn.lessann.test.javaSE03;

public class LogicTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        // false
        System.out.println(a++ > 5 && b++ > 1);
        // 2
        System.out.println(a);
        // 2
        System.out.println(b);
    }
}
