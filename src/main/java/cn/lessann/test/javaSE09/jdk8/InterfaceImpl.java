package cn.lessann.test.javaSE09.jdk8;

public class InterfaceImpl implements Interface1 {
    @Override
    public void show() {
        System.out.println("实现了Interface1的show方法");
        int a = addNum(1, 2);
        System.out.println("调用抽象类静态方法：" + a);
    }

    public static void main(String[] args) {
        InterfaceImpl anInterface = new InterfaceImpl();
        anInterface.show();

        // 执行接口静态方法
        Interface1.getPI();
    }
}
