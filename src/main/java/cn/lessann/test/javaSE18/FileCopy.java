package cn.lessann.test.javaSE18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLDecoder;

public class FileCopy {
    public static void main(String[] args) throws Exception {
        // 因为包含中文，所以必须转解码，URLDecoder.decode解码
        String pathname = URLDecoder.decode(FileCopy.class.getResource("/file/三体.txt").getPath(), "utf-8");
        File file1 = new File(pathname);
        if (!file1.exists()) {
            System.out.println("文件不存在，无法复制");
            return;
        }

        // 获得文件名称
        String fileName = file1.getName();
        String name = fileName.substring(0, fileName.lastIndexOf("."));
        String suffer = fileName.substring(fileName.lastIndexOf("."));

        // 创建复制文件
        File file2 = new File(file1.getParent() + "/" + name + "副本" + suffer);
        // 创建文件
        file2.createNewFile();

        // 创建文件字符输入流
        FileInputStream inputStream = new FileInputStream(file1);

        // 创建文件字符输出流
        FileOutputStream outputStream = new FileOutputStream(file2);

        // 接收内容字节数组
        byte[] bytes = new byte[1024];
        int flag;

        // 读取字节流
        while ((flag = inputStream.read(bytes)) != -1) {
            // 用字节输出流写入文件
            outputStream.write(bytes, 0, flag);
        }

        inputStream.close();
        outputStream.flush();
        outputStream.close();
    }
}
