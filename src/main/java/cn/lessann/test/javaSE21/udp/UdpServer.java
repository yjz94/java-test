package cn.lessann.test.javaSE21.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpServer {
    public static void main(String[] args) {
        try {
            // 创建发送端
            DatagramSocket server = new DatagramSocket();
            // 发送的数据
            byte[] sendData = "我是服务端发给你的数据".getBytes();
            // 接收端地址
            InetAddress address = InetAddress.getLocalHost();
            // 创建数据包对象
            DatagramPacket serverData = new DatagramPacket(sendData, sendData.length, address, 60000);
            // 发送数据
            server.send(serverData);
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
