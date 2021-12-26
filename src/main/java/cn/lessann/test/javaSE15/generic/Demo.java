package cn.lessann.test.javaSE15.generic;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        classTest();

        functionTest();

        test();

        paramTest();
        paramTest("asas");
        paramTest("sa", "as");
        String[] x = {"1", "2"};
        paramTest(x);
    }

    private static void paramTest(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    public static void test() {
        GenericImpl<Object> generic = new GenericImpl<>();

        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        generic.getSize(list);
    }

    public static void interfaceTest() {
        MyInterfaceImpl<String> myInterface = new MyInterfaceImpl<>();
        // 此时只能传递String类型
        myInterface.println("haha");

        MyInterfaceImpl<Integer> myInterface1 = new MyInterfaceImpl<>();
        // 此时只能传递Integer类型
        myInterface1.println(11);
    }

    public static void functionTest() {
        MyFunction.print("你好！");
        MyFunction.print(3.14);
    }

    public static void classTest() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("一");
        myArrayList.add("二");
    }
}
