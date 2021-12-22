package cn.lessann.test.javaSE11;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello World");

        System.out.println(stringBuilder);

        stringBuilder.append(" Java");

        System.out.println(stringBuilder);

        System.out.println(stringBuilder.reverse());

        System.out.println(stringBuilder.length());

        String x = stringBuilder.toString();
        System.out.println(x);
    }
}
