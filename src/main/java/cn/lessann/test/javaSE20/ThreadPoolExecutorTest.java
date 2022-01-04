package cn.lessann.test.javaSE20;

import java.util.concurrent.*;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ArrayBlockingQueue<Runnable> objects = new ArrayBlockingQueue<>(4);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,
                3,
                10,
                TimeUnit.MINUTES,
                objects,
                Executors.defaultThreadFactory()
                , new ThreadPoolExecutor.AbortPolicy()
        );

        MyRunnable myRunnable = new MyRunnable();

        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.execute(myRunnable);

        threadPoolExecutor.shutdown();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
