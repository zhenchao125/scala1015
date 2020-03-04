package com.atguigu.scalal1015.day02.high

/**
 * Author atguigu
 * Date 2020/3/3 16:34
 */
object Closure {
    def main(args: Array[String]): Unit = {
        /*val f: Int => Int = foo()
        val r: Int = f(20)  // 能够访问到a, 是因为闭包的存在
        println(r)*/
        
        /*val f = foo()
        println(f()) // 11
        println(f()) // 12
        val f1 = foo()
        println(f1()) // 11*/
        
    }
    
    /*def foo1() = {
        // 他不是闭包
        () => {
            println("aaa")
        }
    }*/
    
    
    def foo() = {
        var a = 10
        
        () => {
            a += 1; a
        }
    }
    
    /*def foo() = {
        var a = 10
        (b: Int) => a + b
    }*/
}

/*
闭包:
    一个函数, 如果访问了外部的局部遍历,则这个函数和他访问的局部遍历, 称为一个闭包
    
    闭包会阻止外部局部遍历的销毁, 可以把局部变量的使用延伸到函数的外部
    
 
 
 
 */