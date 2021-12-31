package cn.lessann.test.javaSE20;

public class DaemonTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        DaemonTest daemonTest = new DaemonTest();
        daemonTest.setName("daemon");
        daemonTest.setDaemon(true);
        daemonTest.start();

        Thread thread = Thread.currentThread();
        thread.setName("master");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + ":" + i);
        }
    }
}
