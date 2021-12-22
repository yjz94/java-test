package cn.lessann.test.javaSE11;

import java.util.Arrays;

public class SystemTest {
    public static void main(String[] args) {

        int x[] = {1, 3, 5}, y[] = {2, 4, 6};

        System.out.println(System.currentTimeMillis());
        System.arraycopy(x, 0, y, 0, y.length);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

        System.exit(0);
    }
}
