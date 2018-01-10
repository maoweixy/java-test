package com.wei.mao.thread;

/**
 * @Author 毛伟
 * @Date 12/27/17  16:26
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread a = new Thread(new MyThread());
        Thread b = new Thread(new MyThread());
        Thread c = new Thread(new MyThread());
        Thread d = new Thread(new MyThread());
        a.start();
        b.start();
        c.start();
        d.start();
    }
}

class MyThread implements Runnable {
    private int count = 5;

    @Override
    public void run() {
        //while (count > 0) {
        //    System.out.println(Thread.currentThread().getName() + "计算, count = " + count);
        //    count--;
        //    try {
        //        Thread.sleep(1000);
        //    } catch (InterruptedException e) {
        //        e.printStackTrace();
        //    }
        //}
        count--;
        System.out.println(Thread.currentThread().getName() + "计算, count = " + count);

    }
}
