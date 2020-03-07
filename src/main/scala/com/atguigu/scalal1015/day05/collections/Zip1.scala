package com.atguigu.scalal1015.day05.collections

/**
 * Author atguigu
 * Date 2020/3/7 13:53
 */
object Zip1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10)
        val list2 = List(3, 5, 7, 6, 1, 2)
        // 1. 多余的会被抛弃
        //        val list3: List[(Int, Int)] = list1.zip(list2)
        // 2. 多余会使用默认值来进行匹配
        //        val list3: List[(Int, Int)] = list1.zipAll(list2, -1, -2)
        // 3. 和自己的索引进行zip
        val list3: List[(Int, Int)] = list1.zipWithIndex
        for ((e,i) <- list3) {
            println(i)
        }
        
        println(list3)
    }
}

/*
拉链:
 
 */
