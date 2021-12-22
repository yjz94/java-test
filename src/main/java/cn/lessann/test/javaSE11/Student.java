package cn.lessann.test.javaSE11;

public class Student {

    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // 判断两个类是否地址相同
        if (this == o) return true;
        // 判断传入来的是否为空，与当前类类型是否相同
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        // 判断两对象成员变量内容是否相同
        return age == student.age && name.equals(student.name) && sex.equals(student.sex);
    }
}
