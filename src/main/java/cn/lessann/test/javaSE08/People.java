package cn.lessann.test.javaSE08;

public class People {

    private String name;

    public void showName() {
        System.out.println("我的名称：" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
