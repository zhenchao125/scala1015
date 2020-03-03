package com.atguigu.scalal1015.day02.fun

/**
 * Author atguigu
 * Date 2020/3/3 10:50
 */
object Fun2 {
    def main(args: Array[String]): Unit = {
        println(add(10, 20))
        println(add(100, 200))
    }
    
    // 定义函数
    def add(a: Int, b: Int): Int = {
       a + b
    }
}
/*
函数和方法的区别:
    绝大部分情况不需要区分, 所以以后, 说函数和方法都没有区别

在scala中如何定义函数(方法):
    // 函数签名 = 函数体
    def 函数名(参数列表): 函数的返回值 = {
        // 尽量不用return
        // 最后一行代码的值会自动返回
    }
    

 */