package cn.lessann.test.javaSE04;

public class SwitchTest {
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("1选项");
                break;
            case 2:
                System.out.println("2选项");
                break;
            default:
                System.out.println("默认选项");
        }
    }
}
