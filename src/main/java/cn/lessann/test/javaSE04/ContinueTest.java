package cn.lessann.test.javaSE04;

public class ContinueTest {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            switch (x) {
                case 4:
                case 5:
                case 6:
                    x++;
                    continue;
                default:
            }
            System.out.println("x:" + x);
            x++;
        }
    }
}
