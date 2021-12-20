package cn.lessann.test.javaSE08.demo;

/**
 * 表示学生类，继承People
 *
 * @author 少安
 */
public class Student extends People {

    private int studentId;
    private String pro;

    static {
        System.out.println("执行Student静态代码块");
    }

    {
        System.out.println("执行Student代码块");
    }

    public Student() {
        System.out.println("执行Student构造器");
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }
}
