package cn.lessann.test.javaSE18;

import java.io.File;
import java.io.FileReader;
import java.net.URLDecoder;

public class FileReaderTest2 {
    public static void main(String[] args) throws Exception {
        File file = new File(URLDecoder.decode(FileReaderTest2.class.getResource("/file/三体.txt").getFile(), "utf-8"));
        if (!file.exists()) {
            System.out.println("文件不存在，无法读取！");
            return;
        }

        // 创建字符流操作对象
        FileReader fileReader = new FileReader(file);

        // 接收读取字符数组
        char[] chars = new char[1024];
        // 读取是否终结标志
        int flag = -1;

        // 循环读取
        while ((flag = fileReader.read(chars)) != -1) {
            // 显示读取字符
            System.out.println(new String(chars, 0, flag));
        }

        // 关闭流
        fileReader.close();
    }
}
