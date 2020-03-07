package e;

import java.util.Stack;

/**
 * @Author lzc
 * @Date 2020/3/7 11:32
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("a");
        s.push("b");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());


    }
}
