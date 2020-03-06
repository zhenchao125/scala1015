package com.atguigu.scalal1015.day04.more

/**
 * Author atguigu
 * Date 2020/3/6 11:48
 */
object MyApp extends App {
    util.Properties.scalaPropOrNone("scala.time")
    println("aaa")
    foo()
    def foo() = {
        println("aaa")
    }
}
