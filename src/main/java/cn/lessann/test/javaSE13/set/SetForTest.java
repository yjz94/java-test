package cn.lessann.test.javaSE13.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class SetForTest {
    public static void main(String[] args) {
        // 创建HashSet
        HashSet<String> hashSet = new HashSet<>();
        // 新增元素（因为不可重复，只能新增一次，重复新增只会）
        hashSet.add("AA");
        hashSet.add("BB");
        hashSet.add("CC");
        hashSet.add("AA");

        // 增强的for循环
        for (String s : hashSet) {
            System.out.println(s);
        }

        // 迭代器
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // forEach循环
        hashSet.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // forEach加Lambda
        hashSet.forEach(s-> System.out.println(s));
    }
}
