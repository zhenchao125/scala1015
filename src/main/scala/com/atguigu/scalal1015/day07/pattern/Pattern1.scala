package com.atguigu.scalal1015.day07.pattern

/**
 * Author atguigu
 * Date 2020/3/10 9:59
 */
object Pattern1 {
    def main(args: Array[String]): Unit = {
        /*val (a, b): (Int, String) = foo()
        println(a)
        println(b)*/
        /*val Array(a, b, rest@_*) = foo1()
        println(a)
        println(b)
        println(rest)*/
        
        val list = List((1,2 ), (10, 20), (100, 200))
        /*for (kv <- list) {
            println(kv._1)
        }*/
        for((k, 20) <- list){
            println(k)
        }
    }
    
    def foo() = (10, "lisi")
    
    def foo1() = Array(1, 2, 3, 4, 5)
}
