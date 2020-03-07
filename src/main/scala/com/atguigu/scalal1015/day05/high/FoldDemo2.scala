package com.atguigu.scalal1015.day05.high

/**
 * Author atguigu
 * Date 2020/3/7 15:31
 */
object FoldDemo2 {
    def main(args: Array[String]): Unit = {
        // 合并两个Map
        val map1 = Map("a" -> 1, "b" -> 2, "c" -> 3)
        val map2 = Map("a" -> 10, "c" -> 30, "d" -> 40)
        // Map(a -> 11, b -> 2, c -> 33, d -> 40)
        // 最终的结果是Map
        val map3 = map1.foldLeft(map2)((map, kv) => {
            //            map + ( kv._1 ->  (kv._2 + map2.getOrElse(kv._1, 0)))
            val k = kv._1
            val v = kv._2
            map + (k -> (map.getOrElse(k, 0) + v))
        })
        println(map3)
        
    }
}
