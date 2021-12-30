package cn.lessann.test.javaSE18;

import java.io.File;
import java.io.FileReader;
import java.net.URLDecoder;

public class FileReaderTest {
    public static void main(String[] args) throws Exception {
        File file = new File(URLDecoder.decode(FileReaderTest.class.getResource("/file/三体.txt").getFile(), "utf-8"));
        if (!file.exists()) {
            System.out.println("文件不存在，无法读取！");
            return;
        }

        // 创建字符流操作对象
        FileReader fileReader = new FileReader(file);

        // 读取单个字符,(将返回的int强制转换成char)
        System.out.println((char) fileReader.read());

        // 关闭流
        fileReader.close();
    }
}
