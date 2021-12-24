package cn.lessann.test.javaSE14;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "张三");
        hashMap.put(2, "李四");
        hashMap.put(3, "王二");

        Set<Integer> integers = hashMap.keySet();
        for (Integer integer : integers) {
            System.out.println("{key=" + integer + ", value=" + hashMap.get(integer) + "}");
        }
    }
}
