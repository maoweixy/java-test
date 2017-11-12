package com.wei.mao.file;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;
import sun.security.provider.MD5;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class fileTest {
    public static void main(String args[]) throws IOException {
        File file = new File("/Users/maowei/Downloads/duid.txt");
        //for (int i = 0; i < 1000000; i++) {
        //    FileUtils.writeStringToFile(file, DigestUtils.md5Hex(String.valueOf(i))+"\n", true);
        //}
        Set<String> set = new HashSet<>(FileUtils.readLines(file));
        System.out.println(set.size());
        System.out.println("done");
    }
}
