package com.atguigu.scalal1015.day06.pattern

import scala.io.StdIn

/**
 * Author atguigu
 * Date 2020/3/9 12:55
 */
object PatternDemo1 {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 20
        val op = StdIn.readLine("请输入一个运算符: ")
        op match {
            
            case "+" =>
                println(a + b)
            case "-" =>
                println(a - b)
            case "*" =>
                println(a * b)
                
            case _ => println("你的运算符输入的不对!")
            
            case "/" =>
                println(a / b)

             
            
        }
    }
}

/*
模式匹配
    函数编程语言的标配.
    
    有点类似 java 的 switch
    
基本使用:
    要匹配的值 match {
        case 选项 =>
            // 代码
        case 选项 =>
           //
            ...
    }
 */