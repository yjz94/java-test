package cn.lessann.test.javaSE19.properties;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class PropertiesInputTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        // 加载属性文件
        properties.load(new FileReader(PropertiesInputTest.class.getResource("/file/param.properties").getPath()));
        // 获得文件所有key
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(properties.getProperty(string));
        }
    }
}
