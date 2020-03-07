package com.atguigu.scalal1015.day05.list

/**
 * Author atguigu
 * Date 2020/3/7 9:32
 */
object List1 {
    def main(args: Array[String]): Unit = {
        // 1.创建有元素的集合
        val l1 = List(1, 2, 3)
        // 2. 空List
        val l2 = List[Int]()
        // 3. 空集合
        val l3 = Nil
        // 4. 向List添加元素
        //        val l4 = 200 +: l1 :+ 100
        
        
        val l4 = 200 :: 100 :: l1
        println(l4)
    }
}

/*
List
    就是列表
    默认不可变
    
List专用:
    ::
    ::: 合并两个List
 */
