package cn.lessann.test.javaSE03;

public class AutoincreateTest {
    public static void main(String[] args) {
        int a = 1, b = 5;
        // 结果为4
        System.out.println(++a + a++);
        // 结果为8
        System.out.println(b-- + --b);
        // 结果为3
        System.out.println(a);
        // 结果为3
        System.out.println(b);
    }
}
