package cn.lessann.test.javaSE21.udp.multicast;

import java.net.*;
import java.nio.charset.StandardCharsets;

public class MulticastReceive {
    public static void main(String[] args) {
        try {
            MulticastSocket multicastSocket = new MulticastSocket(9898);

            // 绑定组播地址
            multicastSocket.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.1.1"), 9898),
                    NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));

            byte[] buffer = new byte[1024 * 64];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            while (true) {
                multicastSocket.receive(packet);
                System.out.println(new String(packet.getData(), 0, packet.getLength(), StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
