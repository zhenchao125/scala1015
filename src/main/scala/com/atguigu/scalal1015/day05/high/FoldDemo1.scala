package com.atguigu.scalal1015.day05.high

/**
 * Author atguigu
 * Date 2020/3/7 15:19
 */
object FoldDemo1 {
    def main(args: Array[String]): Unit = {
        // "30507060.."
        val list1 = List(30, 50, 70, 60, 10, 20)
        /*val r: Int = list1.foldLeft(0)(_ + _)
        println(r)*/
        // zero 初始值
        //        val result = list1.foldLeft("")((x, y) => x + y)
        //        val result = list1.foldRight("a")((x, y) => x + y)
        
        //        val result = list1./:(0)(_ + _)
        //        val result = (0 /: list1)(_ + _)  // foldLeft 重要
        val result = (list1 :\ 0) (_ + _) // foldRight
        println(result)
        
    }
}
