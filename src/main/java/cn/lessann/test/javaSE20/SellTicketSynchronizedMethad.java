package cn.lessann.test.javaSE20;

import java.util.Random;

public class SellTicketSynchronizedMethad implements Runnable {
    private static  int ticket = 100;

    public static void main(String[] args) {
        Runnable runnable = new SellTicketSynchronizedMethad();

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
            //syncMethad();
            staticSyncMethad();
        }
    }

    // 同步方法
    /*public synchronized void syncMethad() {
        synchronized (this) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售票:" + ticket);
                ticket--;
                try {
                    Thread.sleep(new Random().nextInt(10)*100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/

    // 静态同步方法
    public static synchronized void staticSyncMethad() {
        synchronized (Object.class) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售票:" + ticket);
                ticket--;
                try {
                    Thread.sleep(new Random().nextInt(10)*100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
