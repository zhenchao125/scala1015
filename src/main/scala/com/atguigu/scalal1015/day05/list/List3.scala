package com.atguigu.scalal1015.day05.list

import scala.collection.mutable.ArrayBuffer

/**
 * Author atguigu
 * Date 2020/3/7 9:48
 */
object List3 {
    def main(args: Array[String]): Unit = {
        var arr1 = ArrayBuffer(30, 50, 70, 60, 10, 20)
        println(System.identityHashCode(arr1))
        arr1 :+= 100
        println(System.identityHashCode(arr1))
        
        println(arr1.mkString(", "))
    }
}
/*
+=
++=
    一般只能用于可变结合
    
 其实也可以用户不可变集合
    是产生换一个新的不可变集合, 然后把新的不可变集合赋值变量

 */