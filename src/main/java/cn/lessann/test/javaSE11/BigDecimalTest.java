package cn.lessann.test.javaSE11;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(4.0);

        System.out.println(bigDecimal1.add(BigDecimal.valueOf(3.1)));
        System.out.println(bigDecimal1.subtract(BigDecimal.valueOf(1.1)));
        System.out.println(bigDecimal1.multiply(BigDecimal.valueOf(3)));
        // 下面方法会报错，结果不能整除,所以需要添加四舍五入位数
        // System.out.println(bigDecimal1.divide(BigDecimal.valueOf(3)));
        System.out.println(bigDecimal1.divide(BigDecimal.valueOf(3), 3));

    }
}
