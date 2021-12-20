package cn.lessann.test.javaSE06;

public class FunctionTest1 {
    public static void main(String[] args) {
        showMessage();
        add(1, 2);
        int x = getNum();
        System.out.println(x);
    }

    public static void showMessage() {
        System.out.println("你调用了showMessage方法");
    }

    public static void add(int a, int b) {
        System.out.println("两数相加结果：" + (a + b));
    }

    public static int getNum() {
        return 1;
    }
}
