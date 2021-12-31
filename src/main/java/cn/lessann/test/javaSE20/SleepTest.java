package cn.lessann.test.javaSE20;

public class SleepTest {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 60; i++) {
            System.out.println("当前为：" + i);
            Thread.sleep(1000);
        }
    }
}
