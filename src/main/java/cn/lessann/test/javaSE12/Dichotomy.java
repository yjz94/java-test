package cn.lessann.test.javaSE12;

public class Dichotomy {
    public static void main(String[] args) {
        // 先为数组进行排序
        Bubble.sort();

        int length = Bubble.x.length;
        int index = length / 2;

        int select = 95;

        while (index >= 0) {
            if (Bubble.x[index] == select) {
                break;
            }

            if (Bubble.x[index] > select) {
                index = index + (length - index) / 2;
            }

            if (Bubble.x[index] < select) {
                index = index / 2;
            }
        }
        System.out.println(index);
    }
}
