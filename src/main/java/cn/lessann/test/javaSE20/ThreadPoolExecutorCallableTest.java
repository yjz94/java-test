package cn.lessann.test.javaSE20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ThreadPoolExecutorCallableTest {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue<>(5);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,
                3,
                100,
                TimeUnit.SECONDS,
                queue,
                Executors.defaultThreadFactory()
                , new ThreadPoolExecutor.CallerRunsPolicy()
        );

        CallableTask myCallable = new CallableTask();

        List<Future> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(executor.submit(myCallable));
        }

        while (true) {
            try {
                if (arrayList.size() <= 0) {
                    break;
                }

                Iterator<Future> iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    Future next = iterator.next();
                    if (next.isDone()) {
                        System.out.println(next.get());
                        iterator.remove();
                    }
                }
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}

class CallableTask implements Callable {
    @Override
    public String call() throws Exception {
        Thread.sleep(new Random().nextInt(5) * 1000);
        return Thread.currentThread().getName() + " " + System.currentTimeMillis();
    }
}