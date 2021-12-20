package cn.lessann.test.javaSE06;

public class FunctionTest2 {
    public static void main(String[] args) {
        print(1);
        print("调用重载方法");
    }

    public static void print(int i) {
        System.out.println(i);
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
