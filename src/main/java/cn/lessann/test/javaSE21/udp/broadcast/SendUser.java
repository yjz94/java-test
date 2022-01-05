package cn.lessann.test.javaSE21.udp.broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendUser {
    public static void main(String[] args) {
        try {
            DatagramSocket sendSocket = new DatagramSocket(60000);
            // 广播地址需要设置255.255.255.255
            InetAddress inetAddress = InetAddress.getByName("255.255.255.255");

            DatagramPacket sendData;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("请输入内容：");
                String next = scanner.next();
                if ("close".equals(next) || next == null || next.length() == 0) {

                    break;
                }
                sendData = new DatagramPacket(next.getBytes(), next.getBytes().length, inetAddress, 60001);
                sendSocket.send(sendData);
            }
            sendSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
