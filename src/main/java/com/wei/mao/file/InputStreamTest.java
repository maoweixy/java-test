package com.wei.mao.file;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class InputStreamTest {
    public static void main(String[] args) {
        String s = fileUtils.fileName;
        System.out.println(Charset.defaultCharset());
        System.out.println(System.getProperty("file.encoding"));

    }

    public static void fileInputStream(String file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        //InputStream is = getClass().getResourceAsStream()
    }
}
