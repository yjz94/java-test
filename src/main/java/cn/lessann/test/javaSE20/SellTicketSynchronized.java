package cn.lessann.test.javaSE20;

public class SellTicketSynchronized implements Runnable {

    private int ticket = 100;

    public static void main(String[] args) {
        Runnable runnable = new SellTicketSynchronized();

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
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在出售票:" + ticket);
                    ticket--;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
