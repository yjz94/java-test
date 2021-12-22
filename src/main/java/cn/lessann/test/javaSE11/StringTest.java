package cn.lessann.test.javaSE11;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String x = new String(" You think you can, you can ");

        System.out.println(x.charAt(1));
        System.out.println(Arrays.toString(x.getBytes()));
        System.out.println(x.indexOf("you"));
        System.out.println(x.lastIndexOf("can"));
        System.out.println(x.length());
        System.out.println(x.replace("you", "me"));
        System.out.println(x.replaceAll("you", "me"));
        System.out.println(Arrays.toString(x.split(" ")));
        System.out.println(x.startsWith(" You"));
        System.out.println(x.startsWith("You"));
        System.out.println(x.endsWith("can"));
        System.out.println(x.endsWith("can "));
        System.out.println(x.toUpperCase());
        System.out.println(x.toLowerCase());
        System.out.println(x.trim());
    }
}
