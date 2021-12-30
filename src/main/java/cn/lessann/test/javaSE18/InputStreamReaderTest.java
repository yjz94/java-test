package cn.lessann.test.javaSE18;

import java.io.*;

public class InputStreamReaderTest {
    public static void main(String[] args) throws Exception {
        String path = InputStreamReaderTest.class.getResource("/file/gbk.txt").getPath();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("文件不存在，无法读取！");
            return;
        }

        // 正常读取
        fileReader(file);

        // 使用转换流
        inputStreamReader(file);
    }

    private static void fileReader(File file) throws Exception {
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[128];
        int flag;
        while ((flag = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, flag));
        }
        fileReader.close();
    }

    private static void inputStreamReader(File file) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), "gbk");
        char[] chars = new char[128];
        int flag;
        while ((flag = inputStreamReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, flag));
        }
        inputStreamReader.close();
    }
}
