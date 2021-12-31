package cn.lessann.test.javaSE19.properties;

import java.io.File;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesOutputTest {
    public static void main(String[] args) throws Exception {
        // 创建Properties
        Properties properties = new Properties();
        properties.setProperty("张三", "20");
        properties.setProperty("李四", "18");
        properties.setProperty("王二", "30");

        // 获得文件操作对象
        String path = PropertiesOutputTest.class.getResource("/file/").getPath()+"param.properties";
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }

        // 保存属性到文件中
        properties.store(new FileWriter(file), "who");
    }
}
