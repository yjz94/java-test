package cn.lessann.test.javaSE17.file;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        // 创建文件夹操作对象
        File file1 = new File(FileTest.class.getResource("/").getFile());

        // 获得当前文件夹的所有一级
        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }

        // 获得一级文件或文件夹操作对象数组
        File[] files = file1.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
