package cn.lessann.test.javaSE09;


public class InterfaceImpl implements InterfaceTest1, InterfaceTest2, InterfaceTest3 {


    public void message() {
        InterfaceTest2.show();
    }
}
