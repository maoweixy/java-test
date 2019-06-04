package com.wei.mao.socket;

import javax.mail.internet.InternetAddress;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author MaoWei
 * @Date 2019/5/24 14:24
 */
public class SocketTest1 {
    public static void main(String args[]) throws IOException {
        String host = "baidu.com";
        InetAddress[] addresses = InetAddress.getAllByName(host);
        for (InetAddress address : addresses) {
            System.out.println(address.getHostAddress());
        }
    }
}
