package cn.lessann.test.javaSE10.innerclass;

public class StaticInnerClass1 {
    public static String str = "Version 1.0";
    public static int num = 10;
    private String name;

    public static class Inner {
        private String type;
        private int age;

        public Inner() {
        }

        public Inner(String type, int age) {
            this.type = type;
            this.age = age;
        }

        public void show() {
            System.out.println(str);
            System.out.println(num);
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        StaticInnerClass1.Inner inner = new StaticInnerClass1.Inner();
        inner.show();
    }
}
