package cn.lessann.test.javaSE21.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpUser1 {
    public static void main(String[] args) {
        try {
            // 创建发送端
            DatagramSocket user1Socket = new DatagramSocket(60001);
            // 输入对象
            Scanner scanner = new Scanner(System.in);
            // 传输数据对象
            DatagramPacket datagramPacket;
            // 目标地址对象
            InetAddress localHost = InetAddress.getLocalHost();

            // 循环发送内容
            while (true) {
                System.out.println("请输入发送内容：");
                String data = scanner.next();
                if ("close".equals(data) || data == null || data.length() == 0) {
                    user1Socket.close();
                    break;
                }
                datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length, localHost, 60002);
                user1Socket.send(datagramPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
