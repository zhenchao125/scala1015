package com.atguigu.scalal1015.day06.pattern

import scala.io.StdIn

/**
 * Author atguigu
 * Date 2020/3/9 14:39
 */
object PatternDemo3 {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 20
        val op = StdIn.readLine("请输入一个运算符: ")
        val r = op match {
            case "+" =>
                a + b
            case "-" =>
                a - b
            case "*" =>
                a * b
            case "/" =>
                a / b
            case _ => -1
        }
        println(r)
    }
}

/*
任何的语法结构都有值!
    模式匹配也也有值, 他的值就是匹配成功的那个case的最后一行代码的值
 */