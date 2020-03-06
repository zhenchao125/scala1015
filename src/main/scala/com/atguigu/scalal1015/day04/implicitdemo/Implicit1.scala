package com.atguigu.scalal1015.day04.implicitdemo

/**
 * Author atguigu
 * Date 2020/3/6 13:33
 */
object Implicit1 {
    implicit def double2Int(d: Double) = d.toInt
    def main(args: Array[String]): Unit = {
        
        val a: Int = 10.1
        val b : Int = 20.2
        println(a)
        println(b)
    }
}

/*
隐式转换
    1. 隐式转换函数
        implicit def double2Int(d: Double) = d.toInt
        不看函数名, 只看参数和返回值类型
        
        将来可以给已有的类增加功能!
    
    
    2. 隐式类
    
    3. 隐式参数和隐式值



*/