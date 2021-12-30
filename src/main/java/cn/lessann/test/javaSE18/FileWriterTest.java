package cn.lessann.test.javaSE18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLDecoder;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        // 获得文件路径
        String path = URLDecoder.decode(FileWriterTest.class.getResource("/").getPath(), "utf-8") + "file/三体01.txt";
        File file = new File(path);
        // 判断文件是否存在
        if (!file.exists()) {
            // 创建文件
            file.createNewFile();
        }

        // 创建文件字符输出流
        FileWriter fileWriter = new FileWriter(file);

        // 写入字符串
        fileWriter.write("危机纪元现在开始！");

        fileWriter.flush();
        fileWriter.close();
    }
}
