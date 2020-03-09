package com.atguigu.scalal1015.day06.Streamdemo

/**
 * Author atguigu
 * Date 2020/3/9 11:37
 */
object Stream1 {
    def main(args: Array[String]): Unit = {
        /*val list1 = List(30, 50, 70, 60, 10, 20)
        val s1: Stream[Int] = list1.toStream
        /*println(s1)
        println(s1.head)
        println(s1.tail.head)
        println(s1)*/
        // 强制求值
        println(s1.force)*/
        //        println(getS.force)
        
        println(fibSeq(10))
    }
    
    // 斐波那契数列  1 1 2 3 5 8 13 21 ...
    def fibSeq(n: Int): List[Int] = {
        //        def loop(a: Int, b: Int): Stream[Int] = a #:: loop(b, a + b)
        def loop: Stream[Int] = 1 #:: loop.scanLeft(1)(_ + _)
        loop.take(n).force.toList
    }
    
    /*def getS : Stream[Int] = {
      1 #:: getS
    }*/
    
    
}

/*
Stream
    惰性数据结构
 */