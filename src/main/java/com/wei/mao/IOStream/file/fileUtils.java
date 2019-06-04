package com.wei.mao.IOStream.file;

import java.io.File;

/**
 * @Author 毛伟
 * @Email wei.mao@xinmei365.com
 * @Date 17/7/14  15:39
 */
public class fileUtils {
    public static final String fileName = "222.txt";

    public static void getFileName(String path) {
        File f = new File(path);
        if (!f.exists()) {
            System.out.println(path + " not exists");
            return;
        }
        File fa[] = f.listFiles();
        for (int i = 0; i < fa.length; i++) {
            File fs = fa[i];
            if (fs.getName().contains("Big")){
                //System.out.println(path+"/Downloads/"+fs.getName().substring(9,35)+".mkv");
                System.out.println(fs.renameTo(new File(path+"/Downloads/"+fs.getName().substring(9,35)+".mkv")));
                //System.out.println(fs.getName().substring(6,32));
            }
        }
    }
}
