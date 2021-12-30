package cn.lessann.test.javaSE18;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamTest3 {
    public static void main(String[] args) throws Exception {
        // 获得文件操作对象
        File file = new File(FileInputStreamTest2.class.getResource("/file/file.txt").getFile());
        // 判断是否存在
        if (!file.exists()) {
            // 不存在就创建文件
            file.createNewFile();
        }

        // true表示开启文件追加
        FileOutputStream outputStream = new FileOutputStream(file, true);

        String x = "世界！";

        // 将字符串转换成字节数组写入文件
        outputStream.write(x.getBytes());

        // 刷新
        outputStream.flush();

        // 关闭文件
        outputStream.close();
    }
}
