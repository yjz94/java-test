package cn.lessann.test.javaSE13.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterableTest {
    public static void main(String[] args) {
        // 创建单列集合
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 新增元素
        arrayList.add(95);
        arrayList.add(55);
        arrayList.add(13);
        arrayList.add(5);

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
