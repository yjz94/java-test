package cn.lessann.test.javaSE11;

import java.util.Objects;

public class Test4 {
    static int b;
    static String x;
    static String y = "aa";
    static int a = 10;

    public static void main(String[] args) {
        System.out.println(Objects.isNull(x));
        System.out.println(Objects.isNull(y));
        System.out.println(Objects.isNull(a));
        System.out.println(Objects.isNull(b));

    }
}
