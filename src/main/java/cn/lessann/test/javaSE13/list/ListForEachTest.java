package cn.lessann.test.javaSE13.list;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ListForEachTest {
    public static void main(String[] args) {
        // 创建单列集合
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 新增元素
        arrayList.add(95);
        arrayList.add(55);
        arrayList.add(13);
        arrayList.add(5);

        // forEach循环
        arrayList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        // Lambda表达式
        arrayList.forEach(i -> System.out.println(i));
    }
}
