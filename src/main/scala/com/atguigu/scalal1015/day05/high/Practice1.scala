package com.atguigu.scalal1015.day05.high

/**
 * Author atguigu
 * Date 2020/3/7 14:38
 */
object Practice1 {
    def main(args: Array[String]): Unit = {
        val list1: List[Any] = List(30, "aa", 70, false, 10, 20)
        // 得到新的集合, 新的集合只有整数的平方
        // 1. 先过滤出来数字
        
        // 2. 对数字做map (对数据结构调整)
        val list2 = list1.filter(_.isInstanceOf[Int])
            .map(_.asInstanceOf[Int])
            .map(_ ** 3)
        println(list2)
        
    }
    
    implicit class RichInt(a:Int){
        def **(n: Int) = math.pow(a, n).toInt
    }
    
}
