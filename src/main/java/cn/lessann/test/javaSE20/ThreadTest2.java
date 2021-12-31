package cn.lessann.test.javaSE20;

public class ThreadTest2 extends Thread {
    @Override
    public void run() {
        // 获得当前线程和名称
        System.out.println("当前线程：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread1 = new ThreadTest2();
        thread1.setName("thread1");
        thread1.start();
    }
}
