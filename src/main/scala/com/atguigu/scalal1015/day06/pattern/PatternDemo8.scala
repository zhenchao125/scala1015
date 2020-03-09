package com.atguigu.scalal1015.day06.pattern

/**
 * Author atguigu
 * Date 2020/3/9 15:38
 */
object PatternDemo8 {
    def main(args: Array[String]): Unit = {
        val list = List(10, 20, 30, 40)
        
        list match {
            //            case List(a, b, c, d) =>
            //                println(s"List(a, b, $c, $d)")
            
            //            case List(10, abc@_*) =>
            //                println(abc)
            case a :: b :: c :: d :: Nil =>
                println(d)
            case a :: b :: c => // 最后一个一定是List集合
                println(a)
                println(b)
                println(c)
        }
    }
}
