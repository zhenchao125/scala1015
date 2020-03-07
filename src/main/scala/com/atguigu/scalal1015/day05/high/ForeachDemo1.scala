package com.atguigu.scalal1015.day05.high

/**
 * Author atguigu
 * Date 2020/3/7 14:23
 */
object ForeachDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        //        list1.foreach(x => println(x))
        list1.foreach(println)
        
        list1.foreach(println(_))
        
    }
}

/*
map: 1进1出
foreach: 只进不出
    替换掉for循环
 */