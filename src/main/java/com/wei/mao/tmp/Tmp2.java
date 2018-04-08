package com.wei.mao.tmp;

import com.wei.mao.Utils.ZipUtils;

import java.io.IOException;
import java.util.Arrays;

public class Tmp2 {
    public static void main(String[] args) throws IOException {
        String str = "毛";
        String str1 = "mao";
        System.out.println(Integer.toBinaryString(232));
        //System.out.println("原长度："+str.length());
        //System.out.println("原大小："+str.getBytes().length);
        //
        //System.out.println("压缩后："+ ZipUtils.compress(str).length());
        //System.out.println("压缩后大小："+ZipUtils.compress(str).getBytes().length);

        System.out.println("解压后: "+ZipUtils.uncompress(ZipUtils.compress(str1)));
    }
}
