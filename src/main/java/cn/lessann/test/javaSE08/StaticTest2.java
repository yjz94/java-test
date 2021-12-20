package cn.lessann.test.javaSE08;

public class StaticTest2 {
    // 静态代码块
    static {
        System.out.println("静态代码块执行");
    }
    // 代码块
    {
        System.out.println("类代码块执行");
    }
    public static void main(String[] args) {
        // 创建示例
        StaticTest2 staticTest2 = new StaticTest2();
    }
}
