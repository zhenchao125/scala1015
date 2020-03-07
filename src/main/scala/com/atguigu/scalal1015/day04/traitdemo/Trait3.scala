package com.atguigu.scalal1015.day04.traitdemo

object Trait3 {
    def main(args: Array[String]): Unit = {
        val sub = new Sub
        sub.f()
        sub.foo()
    }
}

class Father {
    def f() = println("father... f")
}

class My1 extends Father

//trait F extends Exception
trait F {
    // 自身类型 self 是一个变量名, 可以通过这个名字取调用father中方法
    self: Father => // trait F extends Father
    def foo() = {
        //        self.f()
        this.f()
    }
}

//如果要成功, 则My要么是Exception, 要么是Exception的子类
class Sub extends My1 with F

/*
//如果要成功, 则My要么是Exception, 要么是Exception的子类
1. class Sub extends My with F

2. 对trait使用另外一种更加优雅的语法, 来替换掉让trait继承类
    自身类型.  类型实现了java的依赖注入的功能
 */

