package cn.lessann.test.javaSE20;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new MyTimer(), 3000, 3000);
    }
}

class MyTimer extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务被执行...");
    }
}
