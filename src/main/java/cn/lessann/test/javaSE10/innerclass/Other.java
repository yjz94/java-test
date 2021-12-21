package cn.lessann.test.javaSE10.innerclass;

public class Other {

    private int number = 10;

    public class Inner {
        private int number = 5;

        public void show() {
            int number = 2;
            // 2
            System.out.println(number);
            // 5
            System.out.println(this.number);
            // 10
            System.out.println(Other.this.number);
        }
    }

    public static void main(String[] args) {
        Inner inner = new Other().new Inner();
        inner.show();
    }
}
