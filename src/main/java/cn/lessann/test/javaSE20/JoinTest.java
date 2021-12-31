package cn.lessann.test.javaSE20;

public class JoinTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "：" + i);
        }
    }

    public static void main(String[] args) {
        JoinTest joinTest = new JoinTest();
        joinTest.setName("join");
        joinTest.start();

        try {
            joinTest.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("在Join什么时候执行了？");
    }
}
