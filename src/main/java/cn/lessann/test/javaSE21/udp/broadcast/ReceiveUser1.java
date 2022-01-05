package cn.lessann.test.javaSE21.udp.broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class ReceiveUser1 {
    public static void main(String[] args) {
        try {
            DatagramSocket receiveSocket = new DatagramSocket(60001);

            while (true) {
                DatagramPacket receiveData = new DatagramPacket(new byte[1024 * 64], 1024 * 64);
                receiveSocket.receive(receiveData);

                System.out.println(new String(receiveData.getData(), 0, receiveData.getLength(),
                        StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
