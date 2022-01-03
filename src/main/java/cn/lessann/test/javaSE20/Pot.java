package cn.lessann.test.javaSE20;

import java.util.Random;

public class Pot {
    private String rice = null;

    public synchronized String getRice() {
        try {
            if (rice == null) {
                System.out.println("锅内无大米，等待加工中...");
                notify();
                wait();
            }

            return rice;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rice = null;
        }
        return null;
    }


    public synchronized void cookRice(String rice) {
        try {
            if (this.rice != null) {
                System.out.println("锅内有大米，等待食用中...");
                // 唤醒一个线程
                notify();
                // 当前线程继续阻塞
                wait();
            }

            this.rice = rice;
            System.out.println("现在正在煮" + rice);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Pot pot = new Pot();

        Thread cooke = new Thread(new Cook(pot));
        Thread customer = new Thread(new Customer(pot));

        cooke.start();
        customer.start();
    }
}

class Customer implements Runnable {
    private Pot pot;

    public Customer(Pot pot) {
        this.pot = pot;
    }


    @Override
    public void run() {
        while (true) {
            try {
                String rice = pot.getRice();
                System.out.println("开始食用" + rice + "。。。");
                int i = new Random().nextInt(10) * 1000;
                Thread.sleep(i);
                System.out.println("大米食用结束。");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Cook implements Runnable {

    private Pot pot;

    public Cook(Pot pot) {
        this.pot = pot;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            pot.cookRice(i + "牌大米");
        }
    }
}
