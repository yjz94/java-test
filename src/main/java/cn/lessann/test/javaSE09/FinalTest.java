package cn.lessann.test.javaSE09;

public class FinalTest {
    public static final int num = 10;

    public static final Dog dog = new Dog("二哈", 10);

    public static void main(String[] args) {

        System.out.println(num);
        System.out.println(dog.getName());
        // 程序报错
        // num = 20;

        dog.setName("三哈");
        System.out.println(dog.getName());
    }

}
