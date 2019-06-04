package com.wei.mao.IOStream.file.csv;

import com.wei.mao.pojo.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @Author 毛伟
 * @Date 10/31/17  16:19
 */
public class CsvTest {
    public static void main(String args[]) throws FileNotFoundException {
        User user = new User();
        user.setDuid("mao");
        user.setApp_name("wei");
        PrintWriter pw = new PrintWriter(new File("/tmp/test.csv"));
        StringBuilder sb = new StringBuilder();
        sb.append(user.getFields());
        sb.append('\n');

        for (int i = 0; i < 2000000; i++) {
            sb.append(user.toString());
            sb.append('\n');
        }
        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
    }
}
