package com.atguigu.scalal1015.day06.homework

import scala.collection.immutable

/**
 * Author atguigu
 * Date 2020/3/8 11:39
 */
object Homework {
    
    
    def main(args: Array[String]): Unit = {
        //        work1()
        //        work2()
        //        work3()
        //        work4()
        work5()
        
    }
    
    def work1() = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        
        //        val max = list1.reduce((x, y) => if(x >y) x else y)
        //        val max = list1.reduce((x, y) => x.max(y))
        val max = list1.reduce(_.max(_))
        println(max)
    }
    
    def work2(): Unit = {
        // 4. 使用 foldLeft 同时计算最大值和最小值(一次折叠完成)
        val list1 = List(30, 500, 70, 60, -10, 20)
        // (max, min)
        //        val mm = list1.foldLeft((0, 0))((maxMin, e) => (maxMin._1.max(e), maxMin._2.min(e)))
        //        val mm = list1.foldLeft((Int.MinValue, Int.MaxValue))((maxMin, e) => (maxMin._1.max(e), maxMin._2.min(e)))
        val mm: (Int, Int) = list1
            .foldLeft((list1.head, list1.head))((maxMin, e) => (maxMin._1.max(e), maxMin._2.min(e)))
        println(mm)
    }
    
    def work3() = {
        
        
        def indexes(s: String) = {
            // 找到每个字符和他的索引!
            // "hellolloee"
            val charIndex: immutable.IndexedSeq[(Char, Int)] = s.zipWithIndex
            //            charIndex.groupBy(ci => ci._1)
            val charGrouped: Map[Char, immutable.IndexedSeq[(Char, Int)]] = charIndex.groupBy(_._1)
            // 对 Map中的value做类型调整
            /*charGrouped.map(kv => {
                val k = kv._1
                val v = kv._2.map(_._2).toList
                (k, v)
            })*/
            // 如果key不变, 只是改变value, 可以使用mapValue
            charGrouped.mapValues(seq => seq.map(ci => ci._2))
            //            charGrouped.mapValues(seq => seq.map(_._2))
            charGrouped.mapValues(_.map(_._2).toList)
        }
        
        println(indexes("hellolloee"))
    }
    
    
    def work4() = {
        // 6. 实现一个函数，作用与mkString相同，使用foldLeft完成
        def mkString(list: List[Int], start: String, sep: String, end: String) = {
            
            val mid = list.foldLeft("")(_ + sep + _).substring(sep.length)
            s"$start${mid}$end"
        }
        
        // <<1=2=3=4=5>>
        println(mkString(List(1, 2, 3, 4, 5), "<<", "====", ">>"))
    }
    
    def work5() = {
        /*def reverse(s: String) = {
            s.foldLeft("")((x, y) => y + x)
        }*/
        
        /*def reverse(s: String): String = {
            if(s.isEmpty) s
            else reverse(s.tail) + s.head
        }
        
        println(reverse("hello")) // olleh*/
        
        /*def reverse(list: List[Int]) = {
            list.foldLeft(List[Int]())((list, e) => e :: list)
        }*/
        
        def reverse(list: List[Int]): List[Int] = {
            if(list.isEmpty) list
            else reverse(list.tail) :+ list.head
        }
        println(reverse(List(1, 2, 3, 4)))
        
    }
    
    
}

/*
3. 使用 reduce 计算集合中的最大值.
4. 使用 foldLeft 同时计算最大值和最小值(一次折叠完成)
5. 编写一个函数, 接收一个字符串, 返回一个 Map.
    比如: indexes("Helloee")

    返回: Map(H->{0}, e -> {1, 5, 6}, ...)   数字其实是下标

6. 实现一个函数，作用与mkString相同，使用foldLeft完成
7. 不使用 reverse, 使用 foldLeft 实现字符串的反转(或者集合的反转)
8. 手写 scala 版的 wordCount
 */