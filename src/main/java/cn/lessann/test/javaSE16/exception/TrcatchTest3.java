package cn.lessann.test.javaSE16.exception;

import com.sun.jdi.request.ExceptionRequest;

public class TrcatchTest3 {
    public static void main(String[] args) {
        try {
            exceptionTest();
        } catch (Exception e) {
            // 下面是默认处理异常的方法
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public static void exceptionTest() throws Exception {
        // 假装出现异常
        throw new ExceptioTest("出现异常");
    }
}
