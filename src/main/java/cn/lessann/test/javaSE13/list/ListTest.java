package cn.lessann.test.javaSE13.list;

import cn.lessann.test.javaSE13.Book;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<Book> arrayList = new ArrayList<>();
        arrayList.add(new Book("三体", "刘慈欣"));
        arrayList.add(new Book("平凡的世界", "路遥"));
        arrayList.add(new Book("活着", "余华"));
        arrayList.add(new Book("活着", "余华"));

        // 遍历
        for (Book book : arrayList) {
            System.out.println(book);
        }
    }
}
