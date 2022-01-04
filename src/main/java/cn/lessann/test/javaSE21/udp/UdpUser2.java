package cn.lessann.test.javaSE21.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UdpUser2 {
    public static void main(String[] args) {
        try {
            // 创建接收端
            DatagramSocket user2Socket = new DatagramSocket(60002);

            byte[] bytes = new byte[1024 * 64];
            DatagramPacket receiveData = new DatagramPacket(bytes, bytes.length);

            // 循环获得内容
            while (true) {
                // 等待接收数据
                user2Socket.receive(receiveData);

                // 显示数据
                System.out.println(new String(receiveData.getData(), 0, receiveData.getLength(),
                        StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
