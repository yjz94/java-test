package cn.lessann.test.javaSE18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class OutputStreamWriterTest {
    public static void main(String[] args) throws Exception {
        String path = OutputStreamWriterTest.class.getResource("/file/gbk.txt").getPath();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("文件不存在，无法写入");
            return;
        }

        // 正常写入
        fileWriter(file);

        // 转换流后写入
        outputStreamWriter(file);
    }

    private static void fileWriter(File file) throws Exception {
        FileWriter fileWriter = new FileWriter(file, true);
        // 添加换行
        fileWriter.write(System.lineSeparator());
        fileWriter.write("我是正常通过程序写入的");
        fileWriter.close();
    }

    private static void outputStreamWriter(File file) throws Exception {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file, true), "gbk");
        outputStreamWriter.write(System.lineSeparator());
        outputStreamWriter.write("我是转换流写入的");
        outputStreamWriter.close();
    }
}
