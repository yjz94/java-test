package cn.lessann.test.javaSE20;

public class ThreadTest3 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 获得当前线程和名称
        System.out.println("当前线程：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread1 = new ThreadTest3();
        thread1.setName("thread1");
        System.out.println("默认优先级：" + thread1.getPriority());
        thread1.start();

        Thread thread2 = new ThreadTest3();
        Thread thread3 = new ThreadTest3();

        thread2.setName("thread2");
        thread3.setName("thread3");

        // 设置优先级为10
        thread3.setPriority(Thread.MAX_PRIORITY);
        // 设置优先级为1
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread2.start();
        thread3.start();
    }
}
