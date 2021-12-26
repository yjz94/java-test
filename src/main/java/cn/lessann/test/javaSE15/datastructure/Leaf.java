package cn.lessann.test.javaSE15.datastructure;

public class Leaf {

    private int data;
    private int index;

    private Leaf top;
    private Leaf left;
    private Leaf right;

    public Leaf() {
    }

    public Leaf(int data,int index) {
        this.data = data;
        this.index = index;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Leaf getTop() {
        return top;
    }

    public void setTop(Leaf top) {
        this.top = top;
    }

    public Leaf getLeft() {
        return left;
    }

    public void setLeft(Leaf left) {
        this.left = left;
    }

    public Leaf getRight() {
        return right;
    }

    public void setRight(Leaf right) {
        this.right = right;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "data=" + data +
                ", index=" + index +
                ", top=" + top +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
