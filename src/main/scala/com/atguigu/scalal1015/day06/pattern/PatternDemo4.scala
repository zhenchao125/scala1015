package com.atguigu.scalal1015.day06.pattern

object PatternDemo4 {
    def main(args: Array[String]): Unit = {
        val a: Any = 100 // ""  true
        
        a match {
            case a: Int if a > 10 => println(a + 10)
            case s: String => println(s.toUpperCase())
            case b: Boolean => println(b)
            case _ =>
        }
    }
}

/*
基本使用
匹配变量和常量
    区别
模式匹配的值

匹配类型:
 */