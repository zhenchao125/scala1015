package com.atguigu.scalal1015.day06.sort

/**
 * Author atguigu
 * Date 2020/3/9 11:27
 */
object Sort3 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
//        val list2: List[Int] = list1.sortWith((x, y) => x < y)
        // 返回true: 第一个排序在前, 返回false, 第一个排序在后
        val list2: List[Int] = list1.sortWith(_ > _)
        println(list2)
    }
}
/*
sortBy
wortWith
sorted

Ordering 理解
 */