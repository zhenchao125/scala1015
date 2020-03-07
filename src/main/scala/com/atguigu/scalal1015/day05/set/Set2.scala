package com.atguigu.scalal1015.day05.set

import scala.collection.mutable
/**
 * Author atguigu
 * Date 2020/3/7 10:03
 */
object Set2 {
    def main(args: Array[String]): Unit = {
        /*val set1: mutable.Set[Int] = mutable.Set(10, 20, 30)
        set1 += 100
        println(set1)*/
        
        // 使用set去重!
        val list1 = List(30, 50, 70, 60, 10, 20, 30, 50, 70, 60, 10, 20)
        val list2: List[Int] = list1.toSet.toList
        println(list2)
    }
}

/*
Set
    可变和不可变, 默认不可变.
    不重复(去重), 无序
    
    其实就是指的代数的集合
        并集
            |
            ++
            union
        交集
            &
            intersect
        差集
            &~
            --
 
 */