package cn.lessann.test.javaSE19.commonsIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CommonsIoTest {
    public static void main(String[] args) throws Exception {
        String path = CommonsIoTest.class.getResource("/file/file.txt").getPath();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("文件不在，无法进行操作");
            return;
        }

        // 使用FileUtils读文件内容
        String fileContent = FileUtils.readFileToString(file, "utf-8");
        System.out.println("文件内容：" + fileContent);

        char[] chars = new char[1024];

        // 使用IOUtils读内容
        int flag = IOUtils.read(new FileReader(file), chars);
        System.out.println(new String(chars, 0, flag));
    }
}
