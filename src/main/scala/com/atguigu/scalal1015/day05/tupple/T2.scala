package com.atguigu.scalal1015.day05.tupple

/**
 * Author atguigu
 * Date 2020/3/7 10:26
 */
object T2 {
    def main(args: Array[String]): Unit = {
        /*val t1 = (1,2, true, false)
        for (elem <- t1.productIterator) {
            println(elem)
        }*/
        
        //        val t1 = (1, true)
        //        val t2 = 1 -> true
        
        // 5  3   (1, 2)
        /*val abc = /% (5, 3)
        println(abc._1)
        println(abc._2)*/
        
        val t: (Int, Int) = 5 /% 3
        println(t)
    }
    
    def /%(a: Int, b: Int) = {
        (a / b, a % b)
    }
    
    implicit class RichInt(a: Int) {
        def /%(b: Int) = (a / b, a % b)
    }
    
}

/*
Tuple
    元组, 一个特别简单, 而且特别重要的一个数据结构
    
    可以封装多个数据,并且类型允许不同
    
    最多到Tuple22
    
    Tuple2 有人叫对偶
    
    
 */