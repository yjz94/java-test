package cn.lessann.test.javaSE20;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest implements Runnable {

    private Lock lock = new ReentrantLock();

    private int ticket = 20;

    public static void main(String[] args) {
        Runnable runnable = new LockTest();

        Thread thread1 = new Thread(runnable, "窗口1");
        Thread thread2 = new Thread(runnable, "窗口2");
        Thread thread3 = new Thread(runnable, "窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }

    @Override
    public void run() {
        while (true) {
            // 加锁
            lock.lock();
            try {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售票:" + ticket);
                    ticket--;
                    try {
                        Thread.sleep(new Random().nextInt(10) * 100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
