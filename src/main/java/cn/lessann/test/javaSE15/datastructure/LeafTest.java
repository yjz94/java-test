package cn.lessann.test.javaSE15.datastructure;

public class LeafTest {
    public static void main(String[] args) {

        int[] x = {56, 86, 8, 95, 45, 34, 19, 20};

        Leaf leaf = getLeaf(x);

        System.out.println(leaf);
    }

    public static Leaf getLeaf(int[] x) {
        Leaf superLeaf = null;
        for (int i = 0; i < x.length; i++) {
            if (i == 0) {
                superLeaf = new Leaf(x[i], i);
            } else {
                addLeaf(superLeaf, x[i], i);
            }
        }
        return superLeaf;
    }

    public static void addLeaf(Leaf leaf, int data, int index) {
        if (leaf != null) {
            int superData = leaf.getData();

            if (data <= superData) {
                if (leaf.getLeft() == null) {
                    leaf.setLeft(new Leaf(data, index));
                } else {
                    addLeaf(leaf.getLeft(), data, index);
                }
            } else {
                if (leaf.getRight() == null) {
                    leaf.setRight(new Leaf(data, index));
                } else {
                    addLeaf(leaf.getRight(), data, index);
                }
            }
        }
    }
}
