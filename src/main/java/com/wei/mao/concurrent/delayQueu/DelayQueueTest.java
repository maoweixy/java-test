package com.wei.mao.concurrent.delayQueu;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @Author 毛伟
 * @Date 11/21/17  14:44
 */
public class DelayQueueTest {

    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue= new DelayQueue<>();
        DelayedElement ele= new DelayedElement( "cache 3 seconds",3000);
        queue.put(ele);
        System.out.println(queue.take());
    }

    public static class DelayedElement implements Delayed {
        private long expired;
        private long delay;
        private String name;

        DelayedElement(String elementName, long delay) {
            this.name = elementName;
            this.delay = delay;
            this.expired = (delay + System.currentTimeMillis());
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return (expired - System.currentTimeMillis());
        }

        @Override
        public int compareTo(Delayed o) {
            DelayedElement cached=(DelayedElement) o;
            return cached.getExpired()> expired?1:-1;
        }

        @Override
        public String toString() {
            return "DelayedElement [delay=" + delay + ", name=" + name + "]";
        }

        public long getExpired() {
            return expired;
        }
    }


}
