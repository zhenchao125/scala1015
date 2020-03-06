package com.atguigu.scalal1015.day03.controlabs

/**
 * Author atguigu
 * Date 2020/3/4 10:43
 */
object MyWhile {
    def main(args: Array[String]): Unit = {
        var a = 0
        loop(a <= 100) {
            println(a)
            a += 1
        }
        
    }
    
    // 控制抽象
    def loop(condition: => Boolean)(op: => Unit): Unit = {
        if (condition) {
            op
            loop(condition)(op)
        }
    }
}

/*
利用刚才学的递归和名调用, 柯里化来实现一个类型while循环的功能
while(){
}
 */