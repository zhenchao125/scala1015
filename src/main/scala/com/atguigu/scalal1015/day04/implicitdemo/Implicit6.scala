package com.atguigu.scalal1015.day04.implicitdemo

/**
 * Author atguigu
 * Date 2020/3/6 15:25
 */
object A{
   /* implicit def b2a(b: B) = {
        println("A 的伴生对象")
        new A
    }*/
}
class A

object B{
    implicit def b2a(b: B) ={
        println("B 的伴生对象")
        new A
    }
}
class B

object Implicit6 {
    /*implicit def b2a(b: B) = {
        println("当前作用域")
        new A
    }*/
    def main(args: Array[String]): Unit = {
//        val a: A = new B()
    
    }
}


/*
隐式查找的路径问题:
1. 先在当前作用域
2. 再去相关类型(包含泛型的伴生对象)的伴生对象中去找
 */