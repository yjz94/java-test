package cn.lessann.test.javaSE21.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpReceive {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);

        Socket accept = serverSocket.accept();

        InputStream inputStream = accept.getInputStream();

        byte[] bytes = new byte[1024];
        int flag = 0;
        while ((flag = inputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, flag));
        }

        accept.close();
        serverSocket.close();
    }
}
