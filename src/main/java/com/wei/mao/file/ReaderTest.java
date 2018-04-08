package com.wei.mao.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        String s = fileUtils.fileName;
        fileReader(s);
        bufferedReader(s);
    }

    public static void fileReader(String file) throws IOException {
        FileReader reader = new FileReader(file);
        char[] buf = new char[1024];
        int temp = 0;
        String result = "";
        System.out.println("fileReader result is : ");
        while ((temp = reader.read(buf)) != -1) {
            //不用下面的方法，一个buf有1024个char，如果没有填满，则会打印出空char
            //result += new String(buf);
            result += new String(buf, 0, temp);
        }
        //reader.close();
        System.out.println(result);
    }

    public static void bufferedReader(String file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String temp;
        String result = "";
        System.out.println("bufferedReader result is : ");
        while ((temp = bufferedReader.readLine()) != null) {
            result += temp;
        }
        //fileReader.close();
        //bufferedReader.close();
        System.out.println(result);
    }

}
