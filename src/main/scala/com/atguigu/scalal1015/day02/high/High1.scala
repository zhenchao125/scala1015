package com.atguigu.scalal1015.day02.high

object High1 {
    def main(args: Array[String]): Unit = {
        /*val f1: () => Unit = foo()
        f1()*/
        
        foo(f _)
    }
    def f() = {
        println("a")
    }
    
    def foo(x : () => Unit) = {
        println(x)
        x()
    }
    
    
    
    /*def foo() = {
        def f() = {
            println("aaaa")
        }
        f _
    }*/
}
/*
----
函数和方法到底有哪些微妙的区别:

----
高级特性:

1. 函数可以定义在任何位置.
    可以在函数内定义函数
2. 可以把函数当成一个值返回给函数的调用者,
    函数的调用者就可以在函数的外部去调用这个返回的函数
3. 可以把函数当做一个值, 传递给另外一个函数.

4. 如果一个函数f 可以返回一个函数作为返回值, 或者可以接受一个(多个)函数作为参数,
 那么这个函数f就称为高阶函数!!!
 


 */