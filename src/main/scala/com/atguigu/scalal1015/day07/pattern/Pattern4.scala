package com.atguigu.scalal1015.day07.pattern

/**
 * Author atguigu
 * Date 2020/3/10 10:19
 */
object Pattern4 {
    def main(args: Array[String]): Unit = {
        //        val map = Map("a"-> 97,"b"-> 98,"c"-> 99)
        /*map.foreach(x => {
            println(x._1)
            println(x._2)
        })*/
        /*map.foreach({
            case (k, v) => println(k)
        })*/
        
        val list = List(
            ("a", ("b", (1, "c"))),
            ("aa", ("bb", (2, "cc"))))
        val list2 = list.map {
            case (a, (b, (c, d))) => c
        }
        println(list2)
        
        /*val r = foo{
            case (x, y) => x + y
        }*/
        
        /*val r = foo((x, y) => {
            x + y
        })*/
        
        val r = foo(xy => xy._1 + xy._2)
        println(r)
    }
    
    
    def foo(f: ((Int, Int)) => Int) = f  ( (10, 20))
}

/*
用一对大括号括起来的一个或多个case语句就是偏函数

偏函数使用的地方很多, 但是大部分情况都是把给他当成一个普通的函数来使用

如果函数的参数是元组的时候, 喜欢时候使用偏函数

使用的策略:
    当传递的函数只有一个参数, 并且这个参数是元组的时候, 才使用便宜
 */