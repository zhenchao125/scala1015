package com.atguigu.scalal1015.day05.high

/**
 * Author atguigu
 * Date 2020/3/7 16:31
 */
object WordCount3 {
    def main(args: Array[String]): Unit = {
        val tupleList = List(
            ("Hello hello Scala Spark World", 4),
            ("Hello Scala Spark", 3),
            ("Hello Scala", 2),
            ("Hello", 1))
        // Map(hello-> .., scala->...)
        // 方法: 1
        /*val result = tupleList
            .map(kv => (kv._1 + " ") * kv._2)
            .flatMap(_.split(" "))
            .filter(_.length > 0)
            .groupBy(x => x)
            .mapValues(_.length)*/
        
        // 方法2: (hello,4), (hello, 4), ...
        val wordCoun1: List[(String, Int)] = tupleList.flatMap(kv => {
            val line = kv._1 // "Hello hello Scala Spark World"
            val count = kv._2 // 4
            //            line.split(" ").map(x => (x, count))
            line.split(" ").map((_, count))
        })
        val wordCount1Group = wordCoun1.groupBy(_._1.toLowerCase)
        
        val result = wordCount1Group.mapValues(wordCountList => {
            wordCountList.foldLeft(0)(_ + _._2)
        })
        println(result)
    }
}
