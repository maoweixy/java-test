package com.wei.mao.gc;

import com.wei.mao.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 毛伟
 * @Date 11/17/17  11:56
 */
public class PerformanceTest {
    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public static void main(String[] args) {
        // I assume you will know how to create a object Person yourself...
        List<User> list = new ArrayList<>();
        for (int i = 0; i <= 100000; i++) {
            list.add(new User("Jim", "Knopf"));
        }
        // Get the Java runtime
        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
        // Calculate the used memory
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
        System.out.println("Used memory is megabytes: "
                + bytesToMegabytes(memory));
    }
}
