package cn.lessann.test.javaSE18;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamTest1 {
    public static void main(String[] args) throws Exception {
        // 获得文件操作对象
        File file = new File(FileInputStreamTest1.class.getResource("/file/file.txt").getFile());
        // 判断是否存在
        if (!file.exists()) {
            // 不存在就创建文件
            file.createNewFile();
        }

        // 创建文件字符流
        FileInputStream fileInputStream = new FileInputStream(file);

        // 每次读取的字节数
        byte[] bytes = new byte[1024];
        while (fileInputStream.read(bytes) != -1) {
            // 显示所有字符
            System.out.println(new String(bytes));
        }
    }
}
