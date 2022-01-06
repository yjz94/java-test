package cn.lessann.test.javaSE22.proxy.staticproxy;

public class MusicProxy {
    private Music music;

    public MusicProxy(Music music) {
        this.music = music;
    }

    public void play() {
        playBefore();

        music.play();

        playAfter();
    }

    private void playBefore() {
        System.out.println("拉开帷幕");
        System.out.println("开启灯光");
        System.out.println("前奏响起...");
    }

    private void playAfter() {
        System.out.println("伴奏结束");
        System.out.println("帷幕落下");
        System.out.println("灯光关");
    }
}
