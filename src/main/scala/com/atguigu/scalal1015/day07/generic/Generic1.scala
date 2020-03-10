package com.atguigu.scalal1015.day07.generic

/**
 * Author atguigu
 * Date 2020/3/10 11:31
 */
object Generic1 {
    def main(args: Array[String]): Unit = {
        val p1 = new Point[Int](10, 20)
        val x = p1.x
        
        val p2 = Point(11.1, 1)
        val y = p2.y
    
        val i = p1.dis[String]("10")
        
    }
}

case class Point[T](x: T, y: T){
    var z:T = x
    def foo():T = x
    
    def dis[A](a: A) = a
}


/*

1. 泛型类和泛型方法入手

 数据类型参数化
 
 a: 泛型类
    定义类的时候, 定义泛型, 这个泛型就可以在类的任何的地方使用
    
    当成一个类型来使用
    
 b: 泛型方法或者泛型函数
    定义函数的时候, 定义泛型, 这个泛型只能在函数的内部使用


*/