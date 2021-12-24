package cn.lessann.test.javaSE13.list;

import java.util.ArrayList;

public class ListForTest {
    public static void main(String[] args) {
        // 创建单列集合
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 新增元素
        arrayList.add(95);
        arrayList.add(55);
        arrayList.add(13);
        arrayList.add(5);

        // 通过下标遍历
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
