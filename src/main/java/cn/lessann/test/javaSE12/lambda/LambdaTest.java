package cn.lessann.test.javaSE12.lambda;

public class LambdaTest {
    public static void main(String[] args) {
        // 以往使用匿名内部类
        animalBark(new Animal() {
            @Override
            public void bark() {
                System.out.println("现在是通过匿名内部类实现的，喵喵喵。。。");
            }
        });

        // 使用Lambda表达式
        animalBark(()->{
            System.out.println("现在是通过Lambda实现的，汪汪汪。。。");
        });
    }

    public static void animalBark(Animal animal) {
        animal.bark();
    }
}
