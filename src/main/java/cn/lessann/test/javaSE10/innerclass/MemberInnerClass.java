package cn.lessann.test.javaSE10.innerclass;

public class MemberInnerClass {

    public static int flag = 0;

    private String name;
    private int age;

    public MemberInnerClass() {
    }

    public MemberInnerClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    class Inner {
        private String sex;
        private int num;

        public Inner() {
        }

        public Inner(String sex, int num) {
            this.sex = sex;
            this.num = num;
        }

        public void show() {
            System.out.println(flag);
            System.out.println(name);
            System.out.println(age);
            System.out.println(sex);
            System.out.println(num);
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        MemberInnerClass.Inner inner = new MemberInnerClass("张三", 18).new Inner("男", 1);
        inner.show();
    }
}
