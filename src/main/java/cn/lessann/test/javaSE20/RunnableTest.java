package cn.lessann.test.javaSE20;

public class RunnableTest implements Runnable {
    public static void main(String[] args) {
        Runnable runnableTest = new RunnableTest();

        // 创建多线程
        Thread thread1 = new Thread(runnableTest,"thread1");
        Thread thread2 = new Thread(runnableTest, "thread2");

        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "：" + i);
        }
    }
}
