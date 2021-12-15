package cn.lessann.test.javaSE04;

public class BreakTest {
    public static void main(String[] args) {
        int x = 1;
        do {
            if (x == 6) {
                System.out.println("循环");
                break;
            }
            System.out.println("x:" + x);
            x++;
        } while (x < 10);
    }
}
