package com.atguigu.scalal1015.day02.loop

/**
 * Author atguigu
 * Date 2020/3/3 8:53
 */
object WhileDemo1 {
    def main(args: Array[String]): Unit = {
        var i = 0
        val r = while (i < 10) {
            println(i)
            i += 1
            i
        }
        println(r)
    }
}
