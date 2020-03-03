package com.atguigu.scalal1015.day02.high

object High3 {
    def main(args: Array[String]): Unit = {
        // 把方法转成了函数, 没有环境, 所以必须手动转换
//        val add1 = add _
        // 这个时候也是在把方法转成了函数, 但是是scala自动完成
//        val add2: (Int, Int) => Int = add
//        println(add1(10, 20))
//        println(add2(10, 20))
    
//        val r: Int = foo(add)
//        val r: Int = foo(add _)
//        println(r)
        
        
        foo1(add1 _)
        
    }
    
    def add1 = println("add1...")
    def foo1(op: () => Unit) = op()
    
    
    
    def foo(op: (Int,Int) => Int) = {
        op(10, 20)
    }
    
    def add(a: Int, b: Int) = a + b
    
    
}

/*
----
函数和方法到底有哪些微妙的区别:
1. 方法:
    严格上来说, 使用def定义的叫方法, 其实不能叫函数
2. 函数也可以直接定义
     // () => {  }
        val f = (a: Int) => a * a
        
3. 函数和方法之间有一个桥梁:
    可以通过 _ 把方法转成函数
    如果有环境 则scala自动转换
    
4. 函数可以作为值传递, 方法不行


----
高级特性:

1. 函数可以定义在任何位置.
    可以在函数内定义函数
2. 可以把函数当成一个值返回给函数的调用者,
    函数的调用者就可以在函数的外部去调用这个返回的函数
3. 可以把函数当做一个值, 传递给另外一个函数.

4. 如果一个函数f 可以返回一个函数作为返回值, 或者可以接受一个(多个)函数作为参数,
 那么这个函数f就称为高阶函数!!!
 


 */