package cn.lessann.test.javaSE22.annotation;

@AnnotationTest("age")
public class Demo2 {
    // MetaAnnotation注解只能放在成员变量中
    @MetaAnnotation("test")
    private String field;
}
