package com.atguigu.scalal1015.day03.recursive

import scala.annotation.tailrec

/**
 * Author atguigu
 * Date 2020/3/4 9:55
 */
object RecursiveDemo1 {
    def main(args: Array[String]): Unit = {
        println(factorial(60, 1)) // 5 * 4  * 3 * 2
    }
    
    // "累加器" 用来储存中间结果的
    @tailrec
    def factorial(n: Int, acc: BigInt): BigInt = {
        if (n == 1) acc
        else factorial(n - 1, n * acc)
    }
    
    /**
     * 计算n的阶乘
     *
     */
    /*def factorial(n: Long): Long = {
        if(n == 1) throw new RuntimeException
        else n *factorial(n - 1)
        // 10!-> 9!->8!
    }*/
}

/*
递归
    1. 找到递归的算法
         f(5)=5*f(5-1)
         f(n)=n*f(n-1)
    2. 在递归函数内部, 一定要有结束条件
    3. 随着递归的深入, 要有机会到达结束条件
    
尾递归:
    scala会对尾递归做一个优化, 尾递归优化. 就不会出现StackOverflowError
    
    在递归的时候, 只有递归, 没有任何其他的运算, 这就是尾递归
    scala做了优化(迭代算法), java没有
    
    要要找到一个合适的累加器
        走到最深层的时候, 结果出来之后,也是最后结果
        
        1 + 2 + 3...+100
 */