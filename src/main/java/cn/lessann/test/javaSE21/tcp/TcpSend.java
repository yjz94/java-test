package cn.lessann.test.javaSE21.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpSend {
    public static void main(String[] args) throws IOException {
        Socket send = new Socket("127.0.0.1", 9000);

        OutputStream outputStream = send.getOutputStream();

        outputStream.write("这是发送端发送的数据".getBytes());

        send.close();
    }
}
