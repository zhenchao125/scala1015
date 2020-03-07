package com.atguigu.scalal1015.day05.list

/**
 * Author atguigu
 * Date 2020/3/7 9:32
 */
object List2 {
    def main(args: Array[String]): Unit = {
        //        val list1 = List(30, 50, 70, 60, 10, 20)
        //        val list2 = List(3, 5, 7, 6, 1, 2)
        //        val list3 = list1 ++ list2
        //        val list3 = list1 ::: list2  // === list2.:::(list1)
        //        println(list3)
        // 有人用过
        val l1 = ::[Int](1, 1 :: Nil)
        println(l1)
    }
}

/*
List
    就是列表
    默认不可变
    
List专用:
    :: 在头部添加元素
    ::: 合并两个List
 */
