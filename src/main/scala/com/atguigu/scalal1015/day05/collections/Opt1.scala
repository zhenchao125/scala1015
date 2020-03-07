package com.atguigu.scalal1015.day05.collections

/**
 * Author atguigu
 * Date 2020/3/7 11:36
 */
object Opt1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        // 1. 头部元素: 重点
        println(list1.head)
        // 2. 最后一个元素
        println(list1.last)
        // 3. tail: 获取去掉第一个元素, 剩下的组成的集合  : 重点
        println(list1.tail)
        // 4. init: 去掉最后一个
        println(list1.init)
        // 5. 长度
        println(list1.size)
        println(list1.length)
        // 6. 转成横字符串
        println(list1.toString())
        println(list1.mkString(", "))
        println(list1.mkString("1015班级", "-", "?"))
        // 7 .迭代器
        val iterator: Iterator[Int] = list1.iterator
        // 7.1 遍历迭代器1
        while(iterator.hasNext){
            val e: Int = iterator.next()
            println(e)
        }
        // 7.2 遍历迭代器2
        for (elem <- iterator) {
            println(elem)
        }
        // 8. 是否包含
        println(list1.contains(1))
        
        
    }
}
