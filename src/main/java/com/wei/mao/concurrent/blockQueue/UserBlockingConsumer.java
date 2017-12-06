package com.wei.mao.concurrent.blockQueue;

import lombok.AllArgsConstructor;

import java.util.concurrent.BlockingQueue;

/**
 * @Author 毛伟
 * @Date 11/21/17  11:20
 */
@AllArgsConstructor
public class UserBlockingConsumer implements Runnable {
    private BlockingQueue<User> userBlockingQueue;


    @Override
    public void run() {
        try {
            User user;

            // consuming messages until exit message is received
            while (!(user = userBlockingQueue.take()).getName().equals("exit")) {
                Thread.sleep(10);
                System.out.println("userBlockingConsumer: User - " + user.getName() + " consumed.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
