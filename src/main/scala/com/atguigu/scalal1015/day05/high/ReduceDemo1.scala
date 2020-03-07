package com.atguigu.scalal1015.day05.high

/**
 * Author atguigu
 * Date 2020/3/7 15:12
 */
object ReduceDemo1 {
    def main(args: Array[String]): Unit = {
        // 聚合操作
        val list1 = List(30, 50, 70, 60, 10, 20)
        //        val result: Int = list1.reduce((x, y) => x + y)
        //        val result: Int = list1.reduce(_ + _)
        val result: Int = list1.reduceRight(_ + _)
        println(result)
    }
}
