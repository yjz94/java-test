package cn.lessann.test.javaSE22;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) throws Exception {
        // 创建对象
        Student student = new Student();

        // 获得类对象
        Class studentClass = student.getClass();

        // 获得所有方法
        Method[] declaredMethods = studentClass.getDeclaredMethods();

        for (Method method : declaredMethods) {
            // 把私有的方法暴力反射
            method.setAccessible(true);

            // 调用设置名称方法
            if ("setName".equals(method.getName())) {
                method.invoke(student, "王二");
            }
        }

        System.out.println(student);
    }
}
