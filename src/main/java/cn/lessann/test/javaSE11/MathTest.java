package cn.lessann.test.javaSE11;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10));
        System.out.println(Math.ceil(4.4));
        System.out.println(Math.floor(4.4));
        System.out.println(Math.max(2, 9));
        System.out.println(Math.pow(2, 2));

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + Math.random());
        }
    }
}