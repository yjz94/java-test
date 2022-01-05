package cn.lessann.test.javaSE22;

import java.lang.reflect.Field;

public class FieldTest {
    public static void main(String[] args) throws Exception {
        // 通过 类名.class 获得类对象
        Class<Student> studentClass = Student.class;

        // 获得对象
        Student student = studentClass.newInstance();

        // 获得所有成员变量
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            // 因为成员变量是私有的，所以必须暴力反射
            field.setAccessible(true);

            if ("name".equals(field.getName())) {
                // 为对象设置成员变量
                field.set(student, "李四");
            }

            if ("age".equals(field.getName())) {
                // 为对象设置成员变量
                field.set(student, 18);
            }

            if ("sex".equals(field.getName())) {
                // 为对象设置成员变量
                field.set(student, "男");
            }
        }

        System.out.println(student);
    }
}
