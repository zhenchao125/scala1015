package com.atguigu.scalal1015.day06.sort

/**
 * Author atguigu
 * Date 2020/3/9 10:51
 */
class Person(val age: Int, val name: String){
    override def toString: String = s"[age =$age , name =$name ]"
}

object Sort2 {
    def main(args: Array[String]): Unit = {
        /*val list1 = List(30, 50, 70, 60, 10, 20)
        val list2: List[Int] = list1.sortBy(x => x)(Ordering.Int.reverse)
        println(list2)*/
        
        //        val list1 = List("zzzzz", "hello", "world", "hello", "aaa", "b")
        //        val list2: List[String] = list1.sortBy(x => x)
        // 按照字符串的长度升序进行排列
        //        val list2 = list1.sortBy(x => x.length)(Ordering.Int.reverse)
        //        val list2 = list1.sortBy(x => -x.length)
        //        val list2 = list1.sortBy(_.length)
        // 先按照长度升序排, 长度相等的时候使用字母表的升序排
        // 多个指标, 就把这多个指标放在元组中返回
        //        val list2= list1.sortBy(x => (x.length, x))
        // 先按照长度降序排, 长度相等的时候使用字母表的升序排
        //        val list2 = list1.sortBy(x => (x.length, x))(Ordering.Tuple2(Ordering.Int.reverse, Ordering.String))
        // 先按照长度升序, 长度相等的时候使用字母表的降序
        //        val list2 = list1.sortBy(x => (x.length, x))(Ordering.Tuple2(Ordering.Int, Ordering.String.reverse))
        val list = List(new Person(10, "a"), new Person(30, "d"), new Person(10, "b"), new Person(8, "c"))
        // 年龄升序, 年龄等姓名升序
//        val list2 = list.sortBy(user => (user.age, user.name))
        val list2 = list.sortBy(user => (user.age, user.name))(Ordering.Tuple2(Ordering.Int, Ordering.String.reverse))
        println(list2)
    }
}

/*
scala:
    不管是可变集合还是不可变集合, 都是返回一个新的排好的序集合
    原集合不动
sorted
    默认都是自然排序(升序)
    
    1. 让排序的类型有自己排序的功能
        Ordered  就是java中的 Comparable
    
    2. 找一个第3方的比较器
        Ordering 就是java中的 Comparator
        
        java

sortBy
    不需要提供任何的逻辑代码, 只需要指定要排序的指标
        scala

sortWith
    传递一个函数, 然后, 在函数写你的比较规则
        scala
 */