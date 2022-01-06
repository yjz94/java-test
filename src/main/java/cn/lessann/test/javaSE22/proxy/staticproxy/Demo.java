package cn.lessann.test.javaSE22.proxy.staticproxy;

public class Demo {
    public static void main(String[] args) {
        YxMusic yxMusic = new YxMusic();
        MusicProxy musicProxy = new MusicProxy(yxMusic);
        musicProxy.play();
    }
}
