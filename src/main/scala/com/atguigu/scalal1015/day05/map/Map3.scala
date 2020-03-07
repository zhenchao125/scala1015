package com.atguigu.scalal1015.day05.map

/**
 * Author atguigu
 * Date 2020/3/7 11:03
 */
object Map3 {
    def main(args: Array[String]): Unit = {
        val map1: Map[String, Int] = Map[String, Int](
            "a" -> 97,
            "x" -> 0,
            "b" -> 98,
            "c" -> 99)
        // 根据key获取值
        //        val v1: Int = map1("a")
        //        val v1: Int = map1("f")  // 会抛异常
        //        val v1= map1.get("f")
        // 存在就返回对应的value, key不存在, 就返回默认值
        val v1 = map1.getOrElse("f", 100)
        println(v1)
    }
}
