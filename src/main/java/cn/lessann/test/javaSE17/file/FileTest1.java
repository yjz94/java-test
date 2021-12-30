package cn.lessann.test.javaSE17.file;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        // 创建文件操作对象
        File file1 = new File(FileTest.class.getResource("/").getFile() + "temp/temp.txt");
        // 创建文件夹操作对象
        File file2 = new File(FileTest.class.getResource("/").getFile() + "temp");

        System.out.println("文件file1是否存在：" + file1.exists());
        System.out.println("文件file2是否存在：" + file2.exists());

        // 创建文件和文件夹
        file2.mkdirs();
        file1.createNewFile();

        System.out.println("文件file1是否存在：" + file1.exists());
        System.out.println("文件file2是否存在：" + file2.exists());

        // 删除文件
        file1.delete();
        file2.delete();

        System.out.println("文件file1是否存在：" + file1.exists());
        System.out.println("文件file2是否存在：" + file2.exists());
    }
}
