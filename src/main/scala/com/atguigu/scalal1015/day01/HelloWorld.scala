package com.atguigu.scalal1015.day01

case class User(var age: Int, var name:String)
/**
 * 文档注释
 */
object HelloWorld {
    def main(args: Array[String]): Unit = {
        System.out.println("hello world")
        println("hello world")
        
        val a = User(1,"李四")
        a.name = "zs"
        // 单行注释
        //aaaaa
    }
}

/*
20%-30% 注释

执行代码:
  java: 定义类, 然后在类中定义一个静态的main方法
  scala: 没有静态的概念.   创建对象, 在对象中定义main方法
 */