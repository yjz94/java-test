package cn.lessann.test.javaSE15.datastructure;

public class LeafSearch {
    public static int x = -1;

    public static void main(String[] args) {
        int[] array = {56, 86, 8, 95, 45, 34, 19, 20};

        Leaf leaf = LeafTest.getLeaf(array);

        searchIndex(leaf, 8);

        System.out.println(x);
    }

    private static void searchIndex(Leaf leaf, int i) {
        if (leaf != null) {
            int data = leaf.getData();
            if (data == i) {
                x = leaf.getIndex();
            } else if (data < i) {
                searchIndex(leaf.getRight(), i);
            } else if (data > i) {
                searchIndex(leaf.getLeft(), i);
            }
        } else {
            x = -1;
        }
    }
}
