package cn.lessann.test.javaSE22.proxy.dynamic;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        User userDemo = new UserDemo();

        User o = (User) Proxy.newProxyInstance(
                userDemo.getClass().getClassLoader(),
                userDemo.getClass().getInterfaces(),
                new MyInvocationHandler(userDemo));

        o.login();
        o.visitUserManager();
    }
}
