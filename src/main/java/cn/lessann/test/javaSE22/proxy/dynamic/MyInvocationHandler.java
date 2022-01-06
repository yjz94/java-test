package cn.lessann.test.javaSE22.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class MyInvocationHandler implements InvocationHandler {

    Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 登录方法的话统计时间
        if ("login".equals(method.getName())) {
            long start = System.currentTimeMillis();
            Object invoke = method.invoke(object, args);
            System.out.println("login use time:" + ((System.currentTimeMillis() - start) / 1000));
            return invoke;
        }

        // 访问的话就记录日志
        if ("visitUserManager".equals(method.getName())) {
            System.out.println("user visit UserManager");
            return method.invoke(object, args);
        }

        return method.invoke(object, args);
    }
}
