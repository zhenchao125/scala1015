package com.atguigu.scalal1015.day05.high

/**
 * Author atguigu
 * Date 2020/3/7 15:00
 */
object FlatDemo1 {
    def main(args: Array[String]): Unit = {
       /* val list = List(List(1,23), List(2,3,4), List(3,4,5))
        // 得到新的集合: List(1,23,2,3,4,3,4,5)
        val list2: List[Int] = list.flatten
        println(list2)*/
        val list = List("hello world", "hello hello", "atguigu aaa bbb")
        // List(hello, world,...)
//        val list3: List[String] = list.map(x => x.split(" ")).flatten
        // map + flatten. flatMap的传递的函数的返回值必须是一个集合
//        val list3 = list.flatMap(x => x.split(" "))
        val list3 = list.flatMap(_.split(" "))
        println(list3)
    }
}
