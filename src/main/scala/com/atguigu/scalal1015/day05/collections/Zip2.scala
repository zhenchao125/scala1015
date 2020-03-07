package com.atguigu.scalal1015.day05.collections

/**
 * Author atguigu
 * Date 2020/3/7 13:53
 */
object Zip2 {
    def main(args: Array[String]): Unit = {
        val list = Map("a" -> 1, "b" -> 2, "c" -> 3)
        // list中存储的是二维的元组的时候, 才能使用unzip
        val t= list.unzip
        println(t)
        
    }
}

/*
拉链:
 
 */
