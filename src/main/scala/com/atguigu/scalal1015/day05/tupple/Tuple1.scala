package com.atguigu.scalal1015.day05.tupple

/**
 * Author atguigu
 * Date 2020/3/7 10:26
 */
object Tuple1 {
    def main(args: Array[String]): Unit = {
        // 定义方式: 1. 原始
        val t2: (Int, String) = Tuple2(10, "abc")
        println(t2._1)
        println(t2._2)
        //  2. 简化
        val t22 = (10, "abc")
        println(t22._1)
    }
    
    
}
/*
Tuple
    元组, 一个特别简单, 而且特别重要的一个数据结构
    
    可以封装多个数据,并且类型允许不同
    
    最多到Tuple22
    
    Tuple2 有人叫对偶
    
    
 */