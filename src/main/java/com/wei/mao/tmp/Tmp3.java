package com.wei.mao.tmp;

import org.apache.commons.codec.digest.DigestUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.*;

public class Tmp3 {

    public static ExecutorService executorService = Executors.newCachedThreadPool();
    private static CountDownLatch cdl = new CountDownLatch(10);
    private static final Random random = new Random();

    public void test() {
        for (int i = 0; i < 10; i++) executorService.execute(new ThreadTest());
    }

    public static void main(String[] args) {
        //new Tmp3().test();
        //
        ////插入数据完成后  执行修改操作
        //try {
        //    cdl.await();
        //} catch (InterruptedException e) {
        //}
        //System.out.println("它们已经插完啦..............................");
        //executorService.shutdown();
        int a = 1;



    }

    class ThreadTest implements Runnable {

        public void run() {
            //执行插入数据操作  每次插入一条
            // 模拟耗时
            int time = random.nextInt(10000);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + "执行完了，耗时：" + time / 1000 + "秒");
            cdl.countDown();
        }
    }
}

class MyTask implements Runnable {
    private int taskNum;

    public MyTask(int num) {
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行task "+taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕");
    }
}