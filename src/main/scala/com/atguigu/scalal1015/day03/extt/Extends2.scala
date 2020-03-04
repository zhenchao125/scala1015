package com.atguigu.scalal1015.day03.extt

import a.B

/**
 * Author atguigu
 * Date 2020/3/4 15:42
 */
object Extends2 {
    def main(args: Array[String]): Unit = {
        val b1 = new B1
        println(b1.a)
    }
}

class A1{
    val a: Int = 10
    def b = 20
}
class B1 extends A1{
    override val a = 20
    override val b = 30
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
        
3. 覆写的覆写:
    1. val只能覆写val和不带参数的def
    2. var只能覆写抽象的var
    
 注意:
    在java中, 方法有多态, 属性没有多态!
        B extends A
        A a = new B()
        左边的类型叫编译时类型
            编译的时候能不能通过, 则由编译时类型决定
            a.foo()
        右边的类型叫运行时类型
            运行的时候, 方法的具体执行效果, 要看运行时类型
        
        编译时类型和运行时类型不一致, 就产生了多态
        
 */
