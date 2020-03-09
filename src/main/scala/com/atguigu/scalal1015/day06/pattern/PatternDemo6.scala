package com.atguigu.scalal1015.day06.pattern

object PatternDemo6 {
    def main(args: Array[String]): Unit = {
        val arr = Array(2, 2, 20, 10, 1)
        
        arr match {
            /*case Array(2, 2, a, b) =>
//                println("Array(1, 2, _, _)")
               println(a, b)*/
            /*case Array(a, b, _, d)  =>
                println(a)*/
            /*case Array(2, 2, _*) =>
                println("Array(2, 2, _*)")*/
            case Array(2, 2, abc@_*) =>
                println(abc.toList)
            
            
        }
    }
}

/*
模式匹配深入到集合的内部:
    有顺序的集合
    
 */