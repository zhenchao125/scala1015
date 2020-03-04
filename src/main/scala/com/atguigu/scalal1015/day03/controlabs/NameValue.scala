package com.atguigu.scalal1015.day03.controlabs

/**
 * Author atguigu
 * Date 2020/3/4 10:27
 */
object NameValue {
    def main(args: Array[String]): Unit = {
        /*foo(3 + 4)  //foo(7)*/
        /*val f = () => {
            println("f....")
            10
        }
        foo(f())*/
        foo {
            println("aaa....")
            println("100")
            2
        }
    }
    
    // 名调用:  a收到的不是具体的值,而是一个计算过程
    // 接收一段代码, 这段代码计算后的值是Int
    def foo(a: => Int) = {
        println(a)
        println(a)
        println(a)
    }
}

/*
调用函数传值的时候有两种方式:
1. 默认都是值传递(值调用)

2. 名传递(名调用)
    传递的是代码,而不是计算后的值
    在函数内部, 用一次, 传递过来的代码就会执行一次

 */
