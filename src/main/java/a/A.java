package a;

import scala.Predef;

/**
 * @Author lzc
 * @Date 2020/3/2 11:57
 */
public class A {
    public static int type = 100;
    public static int a = 100;

    public static void main(String[] args) {
        int a = 30;
        System.out.println(a = 40); //

        Predef.println("abc");
        Predef.println("abc");
    }


}
