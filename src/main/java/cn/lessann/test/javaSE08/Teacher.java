package cn.lessann.test.javaSE08;

public class Teacher extends People {
    public Teacher() {
        super.setName("Tome");
    }

    @Override
    public void showName() {
        System.out.println("我是教师。我的名字是" + getName());
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.showName();
    }
}
