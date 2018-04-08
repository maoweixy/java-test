package com.wei.mao.tmp;

import org.apache.commons.codec.binary.Base64;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Tmp1 {
    // 压缩
    public static String compress(String str) throws IOException {
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        gzip.write(str.getBytes());
        gzip.close();
        return Base64.encodeBase64String(out.toByteArray());
    }

    // 解压缩
    public static String uncompress(String str) throws IOException {
        int GZIP_MAGIC = 0x8b1f;
        if (str == null || str.length() == 0) {
            return str;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(Base64.decodeBase64(str));
        ByteArrayInputStream inCopy = new ByteArrayInputStream(str
                .getBytes());
        int b = inCopy.read();
        System.out.println("b is " + b);
        int b1 = inCopy.read();
        System.out.println("b1 is " + b1);
        int c = (b1 << 8) | b;
        System.out.println("c is " + c);
        System.out.println(c == GZIP_MAGIC);
        GZIPInputStream gunzip = new GZIPInputStream(in);
        byte[] buffer = new byte[256];
        int n;
        while ((n = gunzip.read(buffer))>= 0) {
            out.write(buffer, 0, n);
        }
        // toString()使用平台默认编码，也可以显式的指定如toString(&quot;GBK&quot;)
        return out.toString();
    }

    // 测试方法
    public static void main(String[] args) throws IOException {

        //测试字符串
        String str="[{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"0\",\"type\":\"0\",\"ctime\":\"11111111\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"},{\"code\":\"2ab6a28dc468472ba8e0c36162336d9a\",\"source\":\"1\",\"type\":\"1\",\"ctime\":\"2222222\"}]";
        String str1 = "adfad";

        System.out.println("原长度："+str.length());
        System.out.println("原大小："+str.getBytes().length);

        System.out.println("压缩后："+compress(str).length());
        System.out.println("压缩后大小："+compress(str).getBytes().length);

        System.out.println("解压后: "+uncompress(compress(str1)));
        //String s = "毛";
        //System.out.println(s.getBytes().length);
        //System.out.println(Arrays.toString(s.getBytes()));
        //System.out.println(Integer.toBinaryString(s.charAt(0)));
        //System.out.println();

    }
}
