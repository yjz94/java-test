package cn.lessann.test.javaSE16.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "李小龙", "成龙", "李连杰", "李莲英", "叶问", "沈腾");
        
        // 传统方法
        System.out.println("传统方法");
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if (s.startsWith("李") && s.length() >= 3) {
                System.out.println(s);
            }
        }

        // Stream流方法
        System.out.println("Stream流方式");
        Stream<String> stream = arrayList.stream();
        stream.filter(s -> s.startsWith("李")).filter(s -> s.length() >= 3).forEach(s -> System.out.println(s));
    }
}
