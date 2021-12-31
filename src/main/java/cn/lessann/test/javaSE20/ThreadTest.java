package cn.lessann.test.javaSE20;

public class ThreadTest extends Thread {
    @Override
    public void run() {
        // 循环打印0-99
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            // 休眠一段时间
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new ThreadTest();
        Thread thread2 = new ThreadTest();

        thread1.start();
        thread2.start();
    }
}
