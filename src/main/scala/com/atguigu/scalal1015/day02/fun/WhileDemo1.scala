package com.atguigu.scalal1015.day02.fun

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

/*
任何的语法结构都有值:
    1. while结构的值是Unit
    2. 赋值语句的值也是Unit
 */