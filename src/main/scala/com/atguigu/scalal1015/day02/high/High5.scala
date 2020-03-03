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
        println(arr1.sum)
    
        /*val result: Int = reduce(arr1, (x, y) => {
            println(s"x = $x, y = $y")
            x * y
        })*/
        val r: Int = reduce(arr1, _ * _)
        println(r)
        
        /*foreach(arr1, a => {
            println(a)
        })*/
        //        foreach(arr1, println)
        //        val arr2 = filter(arr1, x => x % 2 == 0)
        //        val arr2 = filter(arr1, _ % 2 == 0)
        //        val arr2 = filter(arr1, x => x > 25)
        //        val arr2 = filter(arr1, _ > 25)
        
        //        val arr2 = map(arr1, x => x * x * x)
        //        foreach(arr2, println)
        
        
        
    }
    
    /**
     * 聚合查找
     * 1 2 3 4 5 6..100
     * op: (c1, c2) => r
     * c1表示上次聚合的结果, c2这次参与聚合的元素
     *
     * @param arr
     *
     */
    def reduce(arr: Array[Int], op: (Int, Int) => Int): Int = {
        var lastReduce = arr(0)
        for(i <- 1 until arr.length){
            lastReduce = op(lastReduce, arr(i))
        }
        lastReduce
    }
    
    
    /**
     * map操作
     *
     * @param arr
     * @param op
     * @return
     */
    def map(arr: Array[Int], op: Int => Int) = {
        for (elem <- arr) yield op(elem)
    }
    
    
    /**
     * 使用给定的条件对数组进行过滤
     *
     * @param arr
     * @param condition 过滤条件, 返回是true留下
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
    映射. 一进一出

reduce
    聚合操作
    
    
 
 


 */