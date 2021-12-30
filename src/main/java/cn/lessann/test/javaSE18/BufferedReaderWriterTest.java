package cn.lessann.test.javaSE18;

import java.io.*;
import java.net.URLDecoder;

public class BufferedReaderWriterTest {
    public static void main(String[] args) throws Exception {
        String path = URLDecoder.decode(BufferedInputOutputStreamTest.class.getResource("/file/红楼梦.txt").getPath(), "utf-8");

        System.out.println("开始普通字符流文件复制...");
        long start = System.currentTimeMillis();
        copyFile1(path);
        System.out.println("普通字符流文件复制结束，耗时s：" + ((System.currentTimeMillis() - start) / 1000));

        System.out.println("开始字符缓冲流文件复制...");
        start = System.currentTimeMillis();
        copyFile2(path);
        System.out.println("字符缓冲流文件复制结束，耗时s：" + ((System.currentTimeMillis() - start) / 1000));
    }

    private static void copyFile1(String path) throws Exception {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("文件不存在，无法复制！");
            return;
        }

        // 创建新文件
        String fileName = file.getName();
        String name = fileName.substring(0, fileName.lastIndexOf("."));
        String suffer = fileName.substring(fileName.lastIndexOf("."));
        File newFile = new File(file.getParent() + "/" + name + "-back1" + suffer);
        if (!newFile.exists()) {
            newFile.createNewFile();
        }

        // 创建流
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(newFile);

        // 复制内容
        char[] chars = new char[16];
        int flag;
        while ((flag = fileReader.read(chars)) != -1) {
            fileWriter.write(chars, 0, flag);
        }

        fileReader.close();
        fileWriter.close();
    }

    private static void copyFile2(String path) throws Exception {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("文件不存在，无法复制！");
            return;
        }

        // 创建新文件
        String fileName = file.getName();
        String name = fileName.substring(0, fileName.lastIndexOf("."));
        String suffer = fileName.substring(fileName.lastIndexOf("."));
        File newFile = new File(file.getParent() + "/" + name + "-back2" + suffer);
        if (!newFile.exists()) {
            newFile.createNewFile();
        }

        // 创建流
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile));

        // 复制内容
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
