package cn.lessann.test.javaSE18;

import java.io.*;

public class BufferedInputOutputStreamTest {
    public static void main(String[] args) throws Exception {
        String filePath = BufferedInputOutputStreamTest.class.getResource("/file/jdk-8u301-macosx-x64.dmg").getFile();

        System.out.println("开始普通字节流文件复制...");
        long start = System.currentTimeMillis();
        copyFile1(filePath);
        System.out.println("普通字节流文件复制结束，耗时s：" + ((System.currentTimeMillis() - start) / 1000));

        System.out.println("开始字节缓冲流文件复制...");
        start = System.currentTimeMillis();
        copyFile2(filePath);
        System.out.println("字节缓冲流文件复制结束，耗时s：" + ((System.currentTimeMillis() - start) / 1000));
    }

    // 使用普通流复制文件
    public static void copyFile1(String path) throws Exception {
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

        // 创建文件字节输入流
        FileInputStream fileInputStream = new FileInputStream(file);
        // 创建文件字节输出流
        FileOutputStream fileOutputStream = new FileOutputStream(newFile);

        // 字节数组
        byte[] bytes = new byte[128];
        int flag;
        // 文件内容读取
        while ((flag = fileInputStream.read(bytes)) != -1) {
            // 文件内容输出
            fileOutputStream.write(bytes, 0, flag);
        }

        // 关闭流
        fileOutputStream.close();
        fileInputStream.close();
    }

    // 使用缓冲流复制文件
    public static void copyFile2(String path) throws Exception {
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

        // 创建字节缓冲输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        // 创建字节缓冲输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newFile));

        // 字节数组
        byte[] bytes = new byte[128];
        int flag;
        // 文件内容读取
        while ((flag = bufferedInputStream.read(bytes)) != -1) {
            // 文件内容写入
            bufferedOutputStream.write(bytes, 0, flag);
        }

        // 关闭流
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }
}
