package cn.lessann.test.javaSE22.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DogTest {
    public static void main(String[] args) throws Exception {
        // 创建对象
        Dog dog = new Dog();
        // 获得对象类对象
        Class dogClass = dog.getClass();
        // 是否存在指定注解类
        if (dogClass.isAnnotationPresent(DogAnnotation.class)) {
            // 获得DogAnnotation注解
            DogAnnotation annotations = (DogAnnotation) dogClass.getDeclaredAnnotation(DogAnnotation.class);
            // 获得接口类对象
            Class annotationsClass = annotations.getClass();
            // 获得dog类所有属性值
            Field[] dogClassDeclaredFields = dogClass.getDeclaredFields();
            for (Field field : dogClassDeclaredFields) {
                // 获得访问权限
                field.setAccessible(true);
                // 获得属性名
                String name = field.getName();
                // 通过属性名获得注解内部值
                Method method = annotationsClass.getDeclaredMethod(name);
                // 获得访问权限
                method.setAccessible(true);
                // 获得接口值
                Object o = method.invoke(annotations);
                // 设置对象值
                field.set(dog, o);
            }
            System.out.println(dog);
        }
    }
}
