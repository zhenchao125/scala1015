package com.atguigu.scalal1015.day05.map

/**
 * Author atguigu
 * Date 2020/3/7 10:25
 */
object Map1 {
    def main(args: Array[String]): Unit = {
//        val map1: Map[String, Int] = Map[String, Int](("a", 97), ("b", 98), ("c", 99), ("d", 98))
        /*for (kv <- map1) {
            println(kv)
        }*/
        
        /*for (kv <- map1) {
            println(kv._1)
        }*/
    
        /*for ((k, _) <- map1) {
            println(k)
        }*/
    
        /*for ((k, 98) <- map1) {
            println(k)
        }*/
    }
}
/*
Map映射
  默认不可变, 具体的实现是HashMap
  
  scala的Map, 把键和值当做元组(对偶)来处理
 */