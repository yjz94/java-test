package cn.lessann.test.javaSE16.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashMap<Object, Object> map = new HashMap<>();

        // 获得集合Stream流
        Stream<String> stream = list.stream();
        Stream<String> stream1 = set.stream();
        Stream<Object> stream2 = map.keySet().stream();
        Stream<Object> stream3 = map.values().stream();
    }
}
