package com.atguigu.scalal1015.day07.generic

/**
 * Author atguigu
 * Date 2020/3/10 15:28
 */
object Test {
    def main(args: Array[String]): Unit = {
        println(mkString(List(1, 2, 3), "<<", ",", ">>"))
        println(mkString(List("a", "b", "d"), "<<", ",", ">>"))
        println(mkString(Array("a", "b", "d"), "<<", ",", ">>"))
        println(mkString(Set("a", "b", "d"), "<<", ",", ">>"))
    }
    
    def mkString[T](list: Iterable[T], start: String, sep: String, end: String) = {
        
        val mid = list.foldLeft("")(_ + sep + _).substring(sep.length)
        s"$start${mid}$end"
    }
}
