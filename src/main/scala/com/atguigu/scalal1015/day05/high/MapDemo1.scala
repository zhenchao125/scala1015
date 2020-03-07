package com.atguigu.scalal1015.day05.high

/**
 * Author atguigu
 * Date 2020/3/7 14:14
 */
object MapDemo1 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        //        val list2: List[Int] = list1.map(x => x * x)
        //        val list2: List[Double] = list1.map(math.pow(_, 2))
        //        val list2: List[Int] = list1.map(x => x * 2)
        val list2: List[Int] = list1.map(_ * 2)
        println(list2)
    }
}

/*
map
    一进一出
filter
flatMap
reduce
foldLeft
scanLeft
groupBy
排序:
    sorted
    sortBy
    sortWith
 
 */