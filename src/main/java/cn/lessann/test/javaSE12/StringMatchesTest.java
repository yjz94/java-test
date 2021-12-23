package cn.lessann.test.javaSE12;

import java.util.Arrays;

public class StringMatchesTest {
    public static void main(String[] args) {
        System.out.println("a".matches("[a,b,c,d,e]"));

        System.out.println("abc".matches("[a-z]"));
        System.out.println("abc".matches("[a-z]+"));

        System.out.println("9".matches("[\\d]"));

        System.out.println("991607476".matches("[\\d]{6,20}"));


        String temp = "asb121b4b54jb656";
        // 将所有数值替换成A
        String a = temp.replaceAll("[\\d]+", "A");
        System.out.println(a);
        // 以字母进行分割
        System.out.println(Arrays.toString(temp.split("[a-zA-Z]+")));
    }
}
