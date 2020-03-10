package com.atguigu.scalal1015.day07.generic

/**
 * Author atguigu
 * Date 2020/3/10 14:08
 */
object ViewBound {
    def main(args: Array[String]): Unit = {
//        val max1 = max(10, 20)
        val max1 = max("a", "b")
        println(max1)
        
    }
    
    def max[T](x: T, y: T)(implicit ev$1: T => Ordered[T])= {
        if(x > y) x
        else y
    }
}
/*
视图绑定:
    viewBound
    T <% Ordered[T]
    表示一定要存在一个隐式转换函数
        T => Ordered[T]
        Int => Ordered[Int]
        
    def max[T](x: T, y: T)(implicit ev$1: T => Ordered[T])
    
 */
