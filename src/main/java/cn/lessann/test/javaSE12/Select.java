package cn.lessann.test.javaSE12;

import java.util.Arrays;

public class Select {
    public static void main(String[] args) {
        System.out.println("排序前：" + Arrays.toString(Bubble.x));
        // 进行正序排序
        for (int i = 0; i < Bubble.x.length - 1; i++) {
            for (int y = i + 1; y < Bubble.x.length; y++) {
                if (Bubble.x[i] < Bubble.x[y]) {
                    int temp = Bubble.x[i];
                    Bubble.x[i] = Bubble.x[y];
                    Bubble.x[y] = temp;
                }
            }
        }
        System.out.println("排序后：" + Arrays.toString(Bubble.x));
    }
}
