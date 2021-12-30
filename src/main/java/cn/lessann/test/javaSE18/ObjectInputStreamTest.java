package cn.lessann.test.javaSE18;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
    public static void main(String[] args) throws Exception {
        // 获得文件
        String path = ObjectOutputStreamTest.class.getResource("/file/object.txt").getPath();
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }

        // 创建反序列化对象
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Student student = (Student) objectInputStream.readObject();

        // 关闭流
        objectInputStream.close();

        // 显示反序列化内容
        System.out.println(student);
    }
}
