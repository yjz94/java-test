package cn.lessann.test.javaSE20;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * // 创建一个线程池，如果线程空闲一段时间就会被回收
 * public static ExecutorService newCachedThreadPool()
 * // 创建一个线程池，固定线程数量，如果执行失败则会创建新的线程
 * public static ExecutorService newFixedThreadPool(int nThreads)
 * // 创建单线程线程池，执行失败后线程池会重现创建
 * public static ExecutorService newSingleThreadExecutor()
 * // 创建一个线程池，可以延迟或定时执行任务
 * public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize)
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        /*// newCachedThreadPool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            cachedThreadPool.execute(new RunnableImpl());
        }
        // 运行可以看出创建对应数量的线程
        cachedThreadPool.shutdown();*/

        /*// newFixedThreadPool
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            fixedThreadPool.execute(new RunnableImpl());
        }
        // 运行结果可以看出，只创建了五个线程
        fixedThreadPool.shutdown();*/

        /*// newSingleThreadExecutor
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            singleThreadExecutor.execute(new RunnableImpl());
        }
        // 运行结果可以看见，只创建一个线程
        singleThreadExecutor.shutdown();*/


        // newScheduledThreadPool
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        // 延迟一段时间执行任务
        scheduledExecutorService.schedule(new RunnableImpl(), 3, TimeUnit.SECONDS);
        // 固定时间频率执行任务,如果执行任务时间大于period，等任务执行后立即执行下一次。
        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl(), 5, 3, TimeUnit.SECONDS);
        // 固定延迟时间执行，不管执行时间大于、等于或小于delay时间，都会等这次任务执行完等delay时间后执行下一次
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl(), 5, 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}

class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep((i + 1) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
