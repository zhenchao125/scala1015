package com.atguigu.scalal1015.day05.high

/**
 * Author atguigu
 * Date 2020/3/7 15:43
 */
object ScanLeftDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
//        val list2: List[Int] = list1.scanLeft(0)(_ + _)
        val list2: List[Int] = list1.scanRight(0)(_ + _)
        println(list2)
    }
}
/*
scanLeft:
    是foldLeft的增强版
 */