package com.atguigu.scalal1015.day05.collections

/**
 * Author atguigu
 * Date 2020/3/7 11:47
 */
object Opt2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 20, 60, 10, 20)
        // 1. 反转   1 to 100 reverse
        println(list1.reverse)
        // 2. 获取前几个
        val list2: List[Int] = list1.take(2)
        println(list2)
        // 3. 抛弃前几个
        println(list1.drop(2))
        // 4. 获取满足条件的
        //        val list3: List[Int] = list1.takeWhile(x => x > 20)
        val list3: List[Int] = list1.dropWhile(x => x > 20)
        println(list3)
        // 5. 取后n个
        //        val list5: List[Int] = list1.takeRight(2)
        
        
    }
}
