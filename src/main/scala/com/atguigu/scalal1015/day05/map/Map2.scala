package com.atguigu.scalal1015.day05.map

/**
 * Author atguigu
 * Date 2020/3/7 10:25
 */
object Map2 {
    def main(args: Array[String]): Unit = {
        val map1: Map[String, Int] = Map[String, Int](
            "a" -> 97,
            "x"-> 0,
            "b" -> 98,
            "c" -> 99)
        val map2: Map[String, Int] = Map[String, Int](
            "a" -> 970,
            "z"->1,
            "b" -> 980,
            "c" -> 990)
        
//        val map2 = map1 + ("a" -> 102)
        val map3 = map1 ++ map2
        println(map3)
        
    }
}

/*
Map映射
  默认不可变, 具体的实现是HashMap
  
  scala的Map, 把键和值当做元组(对偶)来处理
 */