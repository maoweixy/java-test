package com.wei.mao.concurrent.blockQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author 毛伟
 * @Date 11/21/17  11:13
 */
public class BlockingQueueTest {
    public static void main(String[] args) {
        // Creating BlockingQueue of size 10
        // BlockingQueue supports operations that wait for the queue to become non-empty when retrieving an element, and
        // wait for space to become available in the queue when storing an element.
        BlockingQueue<User> userQueue = new ArrayBlockingQueue<>(10);
        UserBlockingProducer userProducer = new UserBlockingProducer(userQueue);
        UserBlockingConsumer userConsumer = new UserBlockingConsumer(userQueue);

        // starting producer to produce messages in queue
            new Thread(userProducer).start();

        // starting consumer to consume messages from queue
            new Thread(userConsumer).start();
        System.out.println("Let's get started. Producer / Consumer Test Started.");
    }


}
