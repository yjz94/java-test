package cn.lessann.test.javaSE06;

public class FunctionTest3 {
    public static void main(String[] args) {
        int x = 1, y = 1;
        int[] z = {1, 2, 3, 4, 5};
        add(x, y);

        print(z);

        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
    }

    public static void add(int a, int b) {
        a = a + b;
        System.out.println(a);
    }

    public static void print(int[] z) {
        z[0] = 0;

        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
    }
}
