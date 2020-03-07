package com.atguigu.scalal1015.day05.high

/**
 * Author atguigu
 * Date 2020/3/7 15:58
 */
object GroupByDemo1 {
    def main(args: Array[String]): Unit = {
        /*val list1 = List(30, 5, 7, 60, 1, 20)
        val map = list1.groupBy(x => if(x % 2 == 0) "偶数" else "奇数")
        println(map)*/
        
        val list1 = List("hello", "hello", "world", "atguigu", "hello", "world")
        val wordMap: Map[String, List[String]] = list1.groupBy(x => x)
        // 对wordMap做一个结构调整
        val wordCount = wordMap.map(kv => {
            (kv._1, kv._2.size)
        })
        println(wordCount)
        
    }
}

/*

 */
