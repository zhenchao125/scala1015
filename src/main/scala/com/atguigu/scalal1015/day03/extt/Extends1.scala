package com.atguigu.scalal1015.day03.extt

import a.B

/**
 * Author atguigu
 * Date 2020/3/4 15:42
 */
object Extends1 {
    def main(args: Array[String]): Unit = {
        val b = new B(10)
//        b.foo()
    }
}


class A(val a:Int) {
    
    def this(){
        this(10)
    }
    println("A 主构造内的代码")
    def foo() = {
        println("A foo...")
    }
}

class B(val b: Int) extends A {
    println("B 主构造内的代码")
    override def foo() = {
        println("B foo...")
//        super.foo()
    }
}


/*
java的继承:
    1. 类单继承
    2. 接口 多实现
scala的继承:
    1.类也是单继承
    2. scala没有接口, 但是提供了更加强大的 trail(特质)

注意:
1. 覆写方法, 比较添加关键字 override
    (java是一个可有可无的注解1.6)
    
2. 构造器的特征:
       java:
        父的静态->子的静态->父的构造->子的构造
       scala:
        先执行父的构造, 然后才是子的构造器
        父的主构造->子的主构造->子构造
        
2. 覆写的覆写:
    1. val只能覆写val和不带参数的def
    2. var只能覆写抽象的var
 */
