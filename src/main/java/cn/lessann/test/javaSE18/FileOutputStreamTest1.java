package cn.lessann.test.javaSE18;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamTest1 {
    public static void main(String[] args) throws Exception {
        // 获得文件操作对象
        File file = new File(FileInputStreamTest2.class.getResource("/file/file.txt").getFile());
        // 判断是否存在
        if (!file.exists()) {
            // 不存在就创建文件
            file.createNewFile();
        }

        FileOutputStream outputStream = new FileOutputStream(file);

        outputStream.write(48);
        outputStream.write(65);
        outputStream.write(97);
    }
}
