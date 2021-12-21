package cn.lessann.test.javaSE09;

public enum Direction {
    UP("向上", 1),
    DOWN("向下", 2),
    LEFT("向左", 3),
    RIGHT("向右", 4);

    private String name;
    private int flag;

    private Direction(String name, int flag) {
        this.name = name;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
