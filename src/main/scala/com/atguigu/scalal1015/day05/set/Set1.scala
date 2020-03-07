package com.atguigu.scalal1015.day05.set

/**
 * Author atguigu
 * Date 2020/3/7 10:03
 */
object Set1 {
    def main(args: Array[String]): Unit = {
        // 不可变集合
        /*val set1 = Set(1, 2, 3, 4, 5, 1, 2)
        val set2 = set1 + 10
        println(set1)
        println(set2)*/
        val set1 = Set(30, 50, 70, 60, 10, 20)
        val set2 = Set(30, 5, 70, 6, 10, 2)
        
        //        val set3: Set[Int] = set1 ++ set2
        //        val set3: Set[Int] = set1 | set2
        //        val set3: Set[Int] = set1 union  set2
        //        val set3: Set[Int] = set1 & set2
        //        val set3: Set[Int] = set1 intersect  set2
//        val set3 = set1 &~ set2
        val set3 = set1 -- set2
        println(set3)
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