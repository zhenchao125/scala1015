package com.atguigu.scalal1015.day02.loop

/**
 * Author atguigu
 * Date 2020/3/3 10:10
 */
object For5 {
    def main(args: Array[String]): Unit = {
        // 得到一个序列: 1 4 9 16 ... 100*100
        // for推导式
        /*val r = for (i <- 1 to 100) yield i * i
        println(r)*/
        
        // "abcd" => "AaBbCc"
        val s = for(c <- "abcd") yield c.toString.toUpperCase + c
        println(s.mkString(""))
        // 更加函数式
        println("abcd".map(c => c.toString.toUpperCase + c).mkString(""))
    }
}
