package cn.lessann.test.javaSE22.reflex;

import cn.lessann.test.javaSE22.Student;

import java.lang.reflect.Constructor;

public class ReflexTest1 {
    public static void main(String[] args) throws Exception {
        // Class.forName(全类名)获得类
        Class clazz = Class.forName("cn.lessann.test.javaSE22.Student");

        // 获得无参构造函数
        Constructor constructor = clazz.getConstructor();
        // 创建类对象
        Student student = (Student) constructor.newInstance();

        // 获得私有构造函数
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, Integer.class);
        // 需要暴力反射
        declaredConstructor.setAccessible(true);
        // 创建对象
        Student zs = (Student) declaredConstructor.newInstance("张三", 18);

        System.out.println(zs);
    }
}
