package cn.lessann.test.javaSE20;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) {
        Box box = new Box();

        MyCallable myCallable = new MyCallable(box);

        FutureTask<Integer> futureTask = new FutureTask(myCallable);

        Thread thread = new Thread(futureTask);

        thread.start();

        try {
            System.out.println(futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("121212");
    }
}

class MyCallable implements Callable<Integer> {

    private Box box;

    public MyCallable(Box box) {
        this.box = box;
    }

    @Override
    public Integer call() throws Exception {
        int flag = 0;
        while (flag <= 100) {
            flag = box.addNumber();
            Thread.sleep(500);
        }
        return flag;
    }
}

class Box {
    private int number;

    public synchronized int addNumber() {
        return ++number;
    }
}