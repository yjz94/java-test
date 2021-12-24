package cn.lessann.test.javaSE13.set;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Dog> hashSet = new HashSet<>();
        hashSet.add(new Dog("旺财", 18));
        hashSet.add(new Dog("旺财", 18));

        // 输出可以看见，会有两个相同的元素显示出来，按照不可重复原理，这是不正确的。那么问题出现在哪了。
        for (Dog dog : hashSet) {
            System.out.println(dog);
        }
    }
}
