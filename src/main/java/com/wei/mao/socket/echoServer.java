package com.wei.mao.socket;

import org.apache.avro.ipc.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author MaoWei
 * @Date 2019/5/24 14:24
 */
public class echoServer {
    public static void main(String args[]) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8189);
        System.out.println("wait connect ....");

        Socket incoming = serverSocket.accept();
        InputStream inputStream = incoming.getInputStream();
        OutputStream outputStream = incoming.getOutputStream();
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream, true);
        out.println("hello enter bye to exit");
        boolean done = false;
        while (!done && in.hasNextLine()) {
            String line = in.nextLine();
            out.println("echo : " + line);
            if (line.trim().equalsIgnoreCase("bye")) {
                done = true;
            }
        }
        incoming.close();
    }
}
