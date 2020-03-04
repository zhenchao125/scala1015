package com.atguigu.scalal1015.day03.curry

/**
 * Author atguigu
 * Date 2020/3/4 9:26
 */
object CurryingDemo {
    def main(args: Array[String]): Unit = {
        /*val f: Int => Int = add(5)
        println(f(6))
        println(f(7))
        val f1 =add(6)
        println(f1(6))
        println(f1(7))*/
        /*val r: Int = add(5)(6)
        println(r)*/
        
        
    }
    // 函数的柯里化!!!
    def add(a: Int)(b: Int) = a + b
    
    /*def add(a: Int) =
        (b: Int) => a + b*/
    
    def add1(a: Int, b: Int) = a + b
}

/*
柯里化!
1. 普通函数->高阶函数->柯里化
2. 把函数的一个参数列表, 变成多个参数列表的过程, 就是柯里化!
3. 一般:第一个列表是必须传递, 第二个列表内的一般是隐式参数!!(scala会自动帮我们找到对应的隐式值传递)
4. 柯里化的理论基础是闭包

函数式编程有几个标配:
    1. 高阶函数
    2. 闭包
    3. 柯里化
    4. 模式匹配
            ...
 */
