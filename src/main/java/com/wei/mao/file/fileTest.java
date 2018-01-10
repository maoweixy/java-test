package com.wei.mao.file;

import java.io.File;
import java.io.IOException;


public class fileTest {
    public static void main(String args[]) throws IOException {

        File file = new File("/Users/maowei/Downloads/test.txt");
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
    }
}
