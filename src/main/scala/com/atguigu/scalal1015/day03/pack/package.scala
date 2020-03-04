package com.atguigu.scalal1015.day03

// 这个对象的内的所有属性和方法, 在pack包内的所有的类可以直接使用
package object pack {
    def foo() = println("foo...")
    
    def main(args: Array[String]): Unit = {
    
    }
}
/*
java:
    java.lang.* 默认自动导入
    
scala:
    
    java.lang._
    scala._
    scala.Predef._

 */