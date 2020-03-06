package com.atguigu.scalal1015.day04.implicitdemo

object Implicit7 {
    implicit val a: Int = 10
    
    def main(args: Array[String]): Unit = {
        /*val b: Int = implicitly[Int]
        println(b)*/
        foo
        foo(implicitly[Int])
    }
    
    def foo(implicit a:Int ) = println(a)
}

/*
从冥界召唤隐式值

 */
