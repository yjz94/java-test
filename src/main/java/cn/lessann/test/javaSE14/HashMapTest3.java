package cn.lessann.test.javaSE14;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class HashMapTest3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "张三");
        hashMap.put(2, "李四");
        hashMap.put(3, "王二");

        // 传统匿名内部类
        hashMap.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println("{key=" + integer + ", value=" + s + "}");
            }
        });

        // Lambda表达式
        hashMap.forEach((i, s) -> System.out.println("{key=" + i + ", value=" + s + "}"));
    }
}
