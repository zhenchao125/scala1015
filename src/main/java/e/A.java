package e;

/**
 * @Author lzc
 * @Date 2020/3/6 9:00
 */
public class A {
    public int aa = 100;

    public A foo() throws RuntimeException {
        final A a = new A();
        a.aa = 100;

        return null;
    }

}

class B extends A {
    @Override
    public A foo() {
        return null;
    }
}
/*
覆写方法的规则:
    两同
        方法名, 参数列表
    两小(同)
        返回值类型, 抛出的异常
    一大
        访问权限
 */