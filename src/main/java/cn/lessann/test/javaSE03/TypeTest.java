package cn.lessann.test.javaSE03;

public class TypeTest {
    public static void main(String[] args) {
        int x = 1;
        //  这样直接赋值会出错
        //byte y = x;
        // 前面需要添加转换类型
        byte y = (byte) x;
    }
}
