package com.atguigu.scalal1015.day02.loop

import scala.io.StdIn
import scala.util.control.Breaks.{break, breakable}

/**
 * Author atguigu
 * Date 2020/3/3 9:28
 */
object For3 {
    def main(args: Array[String]): Unit = {
        // 1. 从键盘读入一个整数, 判断这个数是不是质数
        val n = StdIn.readInt()
        var isPrime = true
        /* try {
             for (i <- 2 until n) {
                 if (n % i == 0) {
                     isPrime = false
                     throw new IllegalArgumentException
                 }
             }
         }catch {
             case _=>
         }*/
        
        // 结束循环: 本质是自己抛异常, 再去捕捉异常
        // while, do...while, for 都可以使用.
        // 其实任何的地方都可以使用
        breakable {
            for (i <- 2 until n) {
                if (n % i == 0) {
                    isPrime = false
                    break
                }
            }
        }
        
        if (isPrime) {
            println(s"$n 是质数")
        } else {
            println(s"$n 不是质数")
        }
    }
}
