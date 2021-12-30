package cn.lessann.test.javaSE17.file;

import java.io.File;

public class Demo1 {
    public static void main(String[] args) {
        File file = getFile("test.txt");
    }
    public static File getFile(String str) {
        return new File(str);
    }
}
