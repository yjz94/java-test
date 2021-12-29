package cn.lessann.test.javaSE16.exception;

public class TrcatchTest {
    public static void main(String[] args) {
        try {
            int x = 1 / 0;
        } catch (Exception e) {
            // 获得异常信息
            System.out.println("异常信息：" + e.getMessage());
        }
        System.out.println("继续后面的的操作...");
    }
}
