package com.wei.mao.file;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/21  11:54
 */
public class fileTest {
    public static void main(String args[]) {
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
        File[] hiddenaFiles = new File(".").listFiles(File::isHidden);
    }
}
