package com.atguigu.scalal1015.day05.map

import scala.collection.mutable

/**
 * Author atguigu
 * Date 2020/3/7 11:03
 */
object Map4 {
    def main(args: Array[String]): Unit = {
        val map1: mutable.Map[String, Int] = mutable.Map[String, Int](
            "a" -> 97,
            "x" -> 0,
            "b" -> 98,
            "c" -> 99)
//        map1 += (("aa", 100))
//        map1 += "aa"-> 100
//        val v1 = map1.getOrElse("f", 100)
        // 如果key'不存在, 则会组合一个新的kv, 添加到可变的map中
//        val v1 = map1.getOrElseUpdate("f", 100)
//        println(v1)
        map1("a") = 100  // 更加scala
        map1("f") = 100
        map1.update("dd", 200) // 更加java
        println(map1)
    }
}
