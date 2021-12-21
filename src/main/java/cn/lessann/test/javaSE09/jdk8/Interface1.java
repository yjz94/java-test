package cn.lessann.test.javaSE09.jdk8;

public interface Interface1 {

    void show();

    default int add(int x, int y) {
        return x + y;
    }

    default int addNum(int x, int y) {
        return add(x, y);
    }

    static double getPI() {
        return 3.14;
    }

    /*private String showResult() {
        return "";
    }*/
}
