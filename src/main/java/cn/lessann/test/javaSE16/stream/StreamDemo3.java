package cn.lessann.test.javaSE16.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        // 创建数组
        Integer[] x = {0, 1, 3, 5, 7, 9, 11, 9, 2, 4, 6, 8};

        // 获得流
        Stream<Integer> stream = Arrays.stream(x);
        // 流转换成List集合
        List<Integer> list = stream.filter(i -> i >= 5).collect(Collectors.toList());
        // 流转换成Set集合
        Set<Integer> set = stream.collect(Collectors.toSet());
        // 流转换成数组
        Integer[] array = stream.toArray(value -> new Integer[0]);
    }
}
