package cn.lessann.test.javaSE09;

public interface InterfaceTest1 {

    static void show() {
        System.out.println("InterfaceTest1");
    }

    default int add(int x, int y) {
        return 0;
    }
}
