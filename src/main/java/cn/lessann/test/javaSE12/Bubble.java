package cn.lessann.test.javaSE12;


import java.util.Arrays;

public class Bubble {
    public static int[] x = {94, 58, 95, 4, 13, 18, 70, 0, 59, 21};

    public static void main(String[] args) {
        sort();
    }

    public static void sort() {
        System.out.println("排序前：" + Arrays.toString(Bubble.x));
        for (int i = 0; i < x.length - 1; i++) {
            for (int y = 0; y < x.length - 1 - i; y++) {
                if (x[y] < x[y + 1]) {
                    int temp = x[y];
                    x[y] = x[y + 1];
                    x[y + 1] = temp;
                }
            }
        }
        System.out.println("排序后：" + Arrays.toString(Bubble.x));
    }
}
