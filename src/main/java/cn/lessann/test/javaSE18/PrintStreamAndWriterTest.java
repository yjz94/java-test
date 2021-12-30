package cn.lessann.test.javaSE18;

import java.io.*;

public class PrintStreamAndWriterTest {
    public static void main(String[] args) throws Exception {
        String path = PrintStreamAndWriterTest.class.getResource("/file/print.txt").getPath();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("文件不存在，无法写入");
            return;
        }

        // 字节打印流
        printStream(file);

        // 字符打印流
        printWriter(file);
    }

    private static void printStream(File file) throws Exception {
        PrintStream printStream = new PrintStream(new FileOutputStream(file, true));
        printStream.println("我是字节打印流输入的");
        printStream.println("我每次都会输入新一行");
        printStream.println(100);
        printStream.println("--------------");
        printStream.close();
    }

    private static void printWriter(File file) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
        printWriter.println("我是字符打印流输入的");
        printWriter.println("我每次都会输入新一行");
        printWriter.println(100);
        printWriter.close();
    }

}
