package cn.lessann.test.javaSE18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException {
        // 创建Student对象
        Student student = new Student("张三", "男", 18);

        // 获得文件
        String path = ObjectOutputStreamTest.class.getResource("/file/object.txt").getPath();
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }

        // 创建序列化对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
    }
}
