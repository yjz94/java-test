package cn.lessann.test.javaSE10.innerclass;

public interface AnonymousInnerClass {

    void show();

    static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass() {
            @Override
            public void show() {
                System.out.println("匿名类创建");
            }
        };
        anonymousInnerClass.show();
    }
}
