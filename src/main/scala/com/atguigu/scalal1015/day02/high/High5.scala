package com.atguigu.scalal1015.day02.high

/**
 * Author atguigu
 * Date 2020/3/3 15:13
 *
 * 自动格式化:   alt+ctrl+L
 * 复制一行代码: ctrl+D
 */
object High5 {
    def main(args: Array[String]): Unit = {
        val arr1 = Array(30, 5, 7, 60, 1, 20)
        
        /*foreach(arr1, a => {
            println(a)
        })*/
        //        foreach(arr1, println)
//        val arr2 = filter(arr1, x => x % 2 == 0)
//        val arr2 = filter(arr1, _ % 2 == 0)
//        val arr2 = filter(arr1, x => x > 25)
        val arr2 = filter(arr1, _ > 25)
        foreach(arr2, println)
    }
    
    /**
     * 使用给定的条件对数组进行过滤
     * @param arr
     * @param condition  过滤条件, 返回时true留下
     */
    def filter(arr: Array[Int], condition: Int => Boolean) = {
        // 通过一个数组, 得到一个新的数组   for推导
        for (elem <- arr if condition(elem)) yield elem
    }
    
    
    /**
     * 用来遍历数组的高阶函数
     *
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
    过滤.  过滤条件可以通过一个返回boolean的函数来体现

map

reduce


 */