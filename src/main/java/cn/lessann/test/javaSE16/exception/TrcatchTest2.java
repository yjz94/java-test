package cn.lessann.test.javaSE16.exception;

public class TrcatchTest2 {
    public static void main(String[] args) {
        try {
            exceptionTest();
        } catch (Exception e) {
            // 下面是默认处理异常的方法
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    // 将异常抛出去
    public static void exceptionTest() throws Exception {
        // 假装出现异常
        throw new Exception("出现异常");
    }
}
