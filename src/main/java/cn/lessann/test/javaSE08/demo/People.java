package cn.lessann.test.javaSE08.demo;

/**
 * 基类
 *
 * @author 少安
 */
public class People {

    private String name;
    private String sex;
    private int age;

    static {
        System.out.println("执行People静态代码块");
    }

    {
        System.out.println("执行People代码块");
    }

    public People() {
        System.out.println("执行People构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
