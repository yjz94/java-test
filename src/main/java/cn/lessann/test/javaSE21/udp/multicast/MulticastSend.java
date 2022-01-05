package cn.lessann.test.javaSE21.udp.multicast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class MulticastSend {
    public static void main(String[] args) {
        try {
            DatagramSocket sendSocket = new DatagramSocket();

            // 设置组地址
            InetAddress inetAddress = InetAddress.getByName("224.0.1.1");

            DatagramPacket sendData;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("请输入内容：");
                String next = scanner.next();
                if ("close".equals(next) || next == null || next.length() == 0) {
                    break;
                }
                sendData = new DatagramPacket(next.getBytes(), next.getBytes().length, inetAddress, 9898);
                sendSocket.send(sendData);
            }
            sendSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
