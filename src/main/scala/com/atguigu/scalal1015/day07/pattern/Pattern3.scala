package com.atguigu.scalal1015.day07.pattern

/**
 * Author atguigu
 * Date 2020/3/10 10:19
 */
object Pattern3 {
    def main(args: Array[String]): Unit = {
        val list = List(10, 20, 1, "aa", false)
        
        val list2 = list.collect({
            case a: Int => a
        })
        println(list2)
    }
}

/*
用一对大括号括起来的一个或多个case语句就是偏函数

偏函数使用的地方很多, 但是大部分情况都是把给他当成一个普通的函数来使用

 */