package com.atguigu.scalal1015

class MyApp {
    def myPrint(any: Traversable[_]): Unit = {
        println(any.mkString(", "))
    }
}
