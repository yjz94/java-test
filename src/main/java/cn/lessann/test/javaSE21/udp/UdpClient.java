package cn.lessann.test.javaSE21.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class UdpClient {
    public static void main(String[] args) {
        try {
            // 创建接收端
            DatagramSocket client = new DatagramSocket(60000);
            // 接收数组
            byte[] receiveBytes = new byte[1024];
            // 接收数据对象
            DatagramPacket receiveData = new DatagramPacket(receiveBytes, 1024);
            // 接收数据
            client.receive(receiveData);
            // 显示数据
            System.out.println(new String(receiveBytes, 0, 33, StandardCharsets.UTF_8));
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
