package cn.lessann.test.javaSE17.file;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        // 创建文件对象
        File file1 = new File(FileTest.class.getResource("/file/file.txt").getFile());
        // 创建文件夹对象
        File file2 = new File(FileTest.class.getResource("/file").getFile());

        System.out.println("是否为文件夹：" + file1.isDirectory());
        System.out.println("是否为文件夹：" + file2.isDirectory());

        System.out.println("是否为文件：" + file1.isFile());
        System.out.println("是否为文件：" + file2.isFile());

        System.out.println("文件或文件夹是否存在：" + file1.exists());

        System.out.println("文件绝对路径：" + file1.getAbsolutePath());

        System.out.println("文件路径名：" + file1.getPath());

        System.out.println("文件或者文件夹名称：" + file1.getName());

        System.out.println("文件最后修改时间：" + file1.lastModified());
    }
}
