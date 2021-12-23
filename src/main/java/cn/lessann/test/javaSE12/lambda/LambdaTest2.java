package cn.lessann.test.javaSE12.lambda;

public class LambdaTest2 {
    public static void main(String[] args) {
        // 就是如此简单
        showFunctionInterface1((a, b) -> a * 2 + b * 2);
        showFunctionInterface2(a -> a.trim());
    }

    public static void showFunctionInterface1(FunctionInterface1 functionInterface1) {
        int add = functionInterface1.add(1, 2);
        System.out.println(add);
    }

    public static void showFunctionInterface2(FunctionInterface2 functionInterface2) {
        functionInterface2.showParam("Hello World");
    }
}
