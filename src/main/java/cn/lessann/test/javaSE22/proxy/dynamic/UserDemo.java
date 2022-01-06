package cn.lessann.test.javaSE22.proxy.dynamic;

public class UserDemo implements User{

    @Override
    public void login() {
        System.out.println("此处是模拟用户登录");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void visitUserManager() {
        System.out.println("此处模拟登录用户访问用户管理页面");
    }
}
