package com.atguigu.scalal1015.day03.abs

import a.B

/**
 * Author atguigu
 * Date 2020/3/4 16:28
 */
object Abs1 {
    def main(args: Array[String]): Unit = {
        /*val b: A = new B
        b.foo()*/
        // 创建一个匿名内部类的对象
        // 在scala中很少使用匿名内部类
        val a: A = new A(20) {
            override var b: Int = 30
    
            override def foo(): Int = {
                println("abc")
                100
            }
        }
        a.foo()
    }
}

abstract class A(var a: Int) {
    // 属性只声明, 不初始化, 这就是抽象字段
    var b: Int
    
    // 方法只有声明, 没有实现, 就是抽象方法
    def foo(): Int
    
    
}

class B extends A(20) {
    override var b: Int = _
    
    override def foo(): Int = {
        println("foo...")
        10
    }
}

/*
java中有抽象类, scala也有抽象类型

scala的抽象类可以有哪些成员:
1. 普通类可以有的, 抽象类都可以
2. 抽象类可以有抽象方法和抽象字段(属性)
3. 抽象类不能直接创建对象, 只能创建他的子类的对


 */
