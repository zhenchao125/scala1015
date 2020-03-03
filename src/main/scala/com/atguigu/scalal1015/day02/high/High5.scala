package com.atguigu.scalal1015.day02.high

/**
 * Author atguigu
 * Date 2020/3/3 15:13
 *
 * 自动格式化:   alt+ctrl+L
 */
object High5 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        /*foreach(arr1, a => {
            println(a)
        })*/
        foreach(arr1, println)
    }
    
    /**
     * 用来遍历数组的高阶函数
     * @param arr
     * @param op
     */
    def foreach(arr: Array[Int], op: Int => Unit) = {
        for (elem <- arr) {
            op(elem)
        }
    }
}

/*
写几个非常经典的高阶函数:
foreach
    遍历集合中的每个元素
    
    具体遍历到每个元素的时候, 做什么事情, 那是有调用者来确定

filter

map

reduce


 */