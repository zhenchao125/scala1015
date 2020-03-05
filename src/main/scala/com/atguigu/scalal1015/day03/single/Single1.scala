package com.atguigu.scalal1015.day03.single

/**
 * Author atguigu
 * Date 2020/3/4 16:43
 */
object Single1 {
    def main(args: Array[String]): Unit = {
        //        A()  // 等价于 A.apply()
        val a = new A
        a(10) // 等价于 a.apply(10)
        a(10) // 等价于 a.apply(10)
        a(10) // 等价于 a.apply(10)
    }
}

object A {
    def foo = println("foo..")
    
    def apply(): Int = {
        println("apply")
        10
    }
}

class A {
    def apply(c: Int) = {
        println("class A apply...")
    }
}

/*
单例对象:
    java实现单例:
        1. 饿汉式
        2. 懒汉式
        
    scala中单例:
        使用object关键字, 声明出来的对象就是一个单例对象
        独立对象
        
        任何对象(object, 也可以是new), 只要提供了一个apply方法, 都可以
        像使用方法一样去调用对象, 实际就是在调用apply
        
        如果在同一个.scala文件中, 一个object的名字和一个class的名字一样, 则他们分别叫伴生对象和伴生类
        
        编译成字节码之后, 伴生对象的是静态方法, 伴生类是非静态(对象方法)

 */