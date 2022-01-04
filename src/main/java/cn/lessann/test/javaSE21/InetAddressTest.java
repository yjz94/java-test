package cn.lessann.test.javaSE21;

import java.net.InetAddress;

public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        // 获得本地IP
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());

        // 通过域名获得IP
        InetAddress baiduHost = InetAddress.getByName("www.baidu.com");
        System.out.println(baiduHost.getHostName());
        System.out.println(baiduHost.getHostAddress());

        // 通过IP字符串获得ip信息
        InetAddress byName = InetAddress.getByName("39.108.8.251");
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());

        // 获得主机地址信息
        InetAddress loopbackAddress = InetAddress.getLoopbackAddress();
        System.out.println(loopbackAddress.getHostName());
        System.out.println(loopbackAddress.getHostAddress());
    }
}
