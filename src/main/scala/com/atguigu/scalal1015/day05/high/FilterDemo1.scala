package com.atguigu.scalal1015.day05.high

/**
 * Author atguigu
 * Date 2020/3/7 14:36
 */
object FilterDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 5, 7, 60, 1, 20)
//        val list2 = list1.filter(x => x % 2 == 1)
        val list2 = list1.filter(_ % 2 == 1)
        println(list2)
        
    }
}
