package com.atguigu.scalal1015.day06.extra

import java.util.{ArrayList => JAL}

/**
 * Author atguigu
 * Date 2020/3/9 13:51
 */
object JavaScala {
    def main(args: Array[String]): Unit = {
        // 这些隐式转换可以完成scala的集合和java的集合的互转
        // 我们会调用java的一些类库, 需要的参数一般是java的集合, 从java到scala
        import scala.collection.JavaConversions._
        val list = new JAL[Int]()
        list.add(10)
        list.add(100)
        list.add(20)
        list.add(200)
        list += 1000
        
        for(e <- list){
            println(e)
        }
    }
}
/*
java的集合都是可变
scala的集合有可变也有不可变
 */