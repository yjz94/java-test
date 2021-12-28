package cn.lessann.test.javaSE16.stream;

import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {

        // 创建数组
        Integer[] x = {0, 1, 3, 5, 7, 9, 11}, y = {9, 2, 4, 6, 8};

        // 创建数组流
        Stream<Integer> x1 = Stream.of(x);
        Stream<Integer> y1 = Stream.of(y);

        Stream<Integer> concat = Stream.concat(x1, y1);
        // 提过前4个，取前6个，过滤数值大于等于元素，去重，然后打印流内容结束
        concat.skip(4).limit(6)
                .filter(i -> i >= 5)
                .distinct()
                .forEach(i -> System.out.println(i));
    }
}
