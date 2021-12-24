package cn.lessann.test.javaSE14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "张三");
        hashMap.put(2, "李四");
        hashMap.put(3, "王二");
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("{key=" + entry.getKey() + ", value=" + entry.getValue() + "}");
        }
    }
}
