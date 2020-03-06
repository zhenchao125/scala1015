package com.atguigu.scalal1015.day04.traitdemo

/**
 * Author atguigu
 * Date 2020/3/6 10:36
 */
object Trait2 {
    def main(args: Array[String]): Unit = {
        /*val abc = new ABC
        abc.foo()*/
        val my:A = new My with A with B with C
        my.foo()
    }
}
class My


class ABC extends A with B with C{
    override def foo() = {
        super.foo()  //
        println("ABC ...")
    }
}


trait A{
    def foo() = {
        println("A ...")
    }
}

trait B extends A{
    override def foo() = {
        println("B ...")
    }
}

trait C extends A{
    override def foo() = {
        super[A].foo()
        println("C ...")
    }
}
/*
1. 如果一个类混入的特质中有相同的实现好的方法, 则会产生成员冲突
2. 可以使用菱形的继承结构解决冲突问题, 冲突解决之后, 方法谁最后混入的那个
3. super[A] super具体指代
4. 动态混入(叠加)

 */