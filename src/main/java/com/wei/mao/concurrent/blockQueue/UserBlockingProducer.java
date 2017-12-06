package com.wei.mao.concurrent.blockQueue;

import lombok.AllArgsConstructor;

import java.util.concurrent.BlockingQueue;

/**
 * @Author 毛伟
 * @Date 11/21/17  11:15
 */
@AllArgsConstructor
public class UserBlockingProducer implements Runnable {
    private BlockingQueue<User> userBlockingQueue;


    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            User user = new User("i'm user " + i);
            try {
                Thread.sleep(10);
                userBlockingQueue.put(user);
                System.out.println("userBlockingProducer: User - " + user.getName() + " produced.");
            } catch (Exception e) {
                System.out.println("Exception:" + e);
            }
        }
        User user = new User("exit");
        try {
            userBlockingQueue.put(user);
            System.out.println("userBlockingProducer: Exit User - " + user.getName());
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }
    }
}
