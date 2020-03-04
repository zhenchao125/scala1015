package d;

/**
 * @Author lzc
 * @Date 2020/3/4 16:14
 */
public class A {
    public int a = 10;

    public void foo(){
        System.out.println("A foo...");
    }
    public static void main(String[] args) {
        // 方法的多态
//        A a = new B();
//        a.foo();

        B b = new B();
        A a = b;
        System.out.println(b.a); // 20
        System.out.println(a.a); // 20 X  10√
    }
}
class B extends A{
    public int a = 20;

    public void foo(){
        System.out.println("B foo...");
    }

    public void f(){

    }
}
