package cn.lessann.test.javaSE19.tryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryCatchTest1 {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("/file/object.txt")) {
            // 进行输入操作
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
