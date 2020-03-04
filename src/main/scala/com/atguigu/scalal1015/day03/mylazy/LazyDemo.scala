package com.atguigu.scalal1015.day03.mylazy

/**
 * Author atguigu
 * Date 2020/3/4 11:07
 */
object LazyDemo {
    val a1 = { println("a1"); 10}
    // 第一次使用a的时候,才会去求值
    lazy val a2: Int = { println("a2"); 10}
    def a3 = { println("a3"); 10}
    
    
    def main(args: Array[String]): Unit = {
//        println(a2) // 每次, 先判断a是否有值, 如果没有则去计算, 会缓存. 如果有, 就直接使用
        println(a1)
        println(a1)
        println(a1)
        println("----")
        println(a2)
        println(a2)
        println(a2)
        println("----")
        println(a3)
        println(a3)
        println(a3)
        println("----")
    
    }
}
/*
惰性求值:
    有很多的好处
    只能用val
    
 主动求值:
    系统一旦启动, 所有的值都计算出来
    好处: 后面实用的时候速度比较快
    坏处: 拖慢系统的启动速度, 浪费内存
 */