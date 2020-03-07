package com.atguigu.scalal1015.day05.high

/**
 * Author atguigu
 * Date 2020/3/7 14:29
 */
object PartFunDemo {
    def main(args: Array[String]): Unit = {
        /*val square: Double => Double = math.pow(_, 2)
        println(square(10))
        println(square(20))*/
       println(10)
        val myP: Any => Unit = println(_)
        myP(10)
        
    }
}
/*
部分应用函数:
 
 */