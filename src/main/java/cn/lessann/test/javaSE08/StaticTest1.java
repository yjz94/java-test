package cn.lessann.test.javaSE08;

public class StaticTest1 {
    // 定义静态成员变量
    public static double PI = 3.14;
    // 定义实例成员变量
    public double result;

    public static void main(String[] args) {
        // 计算圆的周长
        StaticTest1 staticTest1 = new StaticTest1();
        // 圆的半径为2
        staticTest1.result = 2 * 2 * StaticTest1.PI;
        System.out.println(staticTest1.result);
    }
}
