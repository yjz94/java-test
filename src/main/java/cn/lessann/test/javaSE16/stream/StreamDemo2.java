package cn.lessann.test.javaSE16.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        String[] str = {"张三", "李四", "王二"};

        // 获得数组流
        Stream<String> stream1 = Arrays.stream(str);
        Stream<String> stream2 = Stream.of("张三", "李四", "王二");
    }
}
