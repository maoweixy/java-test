package com.wei.mao.IOStream.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args) throws IOException {
        String s = fileUtils.fileName;
        fileWriter(s);
    }

    public static void fileWriter(String file) throws IOException {
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("本行是通过fileWriter加入的行\r\n");
        //如果想马上看到写入效果，则需要调用w.flush()方法
        fileWriter.flush();
        fileWriter.close();
    }

    public static void bufferedWriter(String file) throws IOException {

    }

}
