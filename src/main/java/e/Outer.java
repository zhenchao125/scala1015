package e;

/**
 * @Author lzc
 * @Date 2020/3/6 8:39
 */
public class Outer {
    int a = 100;
    public class Inner{

        int a= 1000;

        public void foo(){
            System.out.println(a);
            // 访问外部类的a, 外部类的对象: 外部类名.this
            System.out.println(Outer.this.a);

        }
    }


    int outA = 20;

    public Outer() {
        outA = 30;
    }

    public static void main(String[] args) {
        new Outer().foo();
    }


    public void foo() {
        int a = 10;
        class Inner {
            public void f1() {
                // 内部不允许访问外部类的局部变量, 原因是java没有闭包
                // 可以访问成员变量(对象的属性)
                System.out.println(a);
                System.out.println(outA);
            }
        }
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Inner().f1();
            }
        }.start();

    }
}
