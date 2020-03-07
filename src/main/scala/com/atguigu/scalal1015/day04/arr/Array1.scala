package com.atguigu.scalal1015.day04.arr

/**
 * Author atguigu
 * Date 2020/3/6 16:40
 */
object Array1 {
    def main(args: Array[String]): Unit = {
        //        val arr: Array[Int] = Array[Int](1, 2, 3, 4)
        /*println(arr(0))
        arr(0) = 100
        println(arr.mkString(", "))*/
        // 遍历数组 for while
        //        val arr1: Array[Int] = arr :+ 100  // arr.:+(100)
        //        val arr1 = 100 +: arr  // ====  arr.+:(100)
        //        val arr1 = arr.+:(100)
        
        
        //        println(arr1.mkString(", "))
        
        //        val arr1 = Array(30, 50, 70, 60, 10, 20)
        //        val arr2 = Array(3, 5, 7, 6, 1, 2)
        //        val arr3: Array[Int] = arr1 ++ arr2   // === arr1.++(arr2)
        //        myPrint(arr3)
        
//        val arr1 = Array(30, 50, 70, 60, 10, 20)
    
    }
    def myPrint(any: Traversable[_]): Unit = {
        println(any.mkString(", "))
    }
}

/*
<> : 给xml, scala语言级别的支持xml   <user> </user>
[]:给了泛型
(index): 访问指定索引的元素



1. scala没有自己定义数组, 底层就是java的数组
    定长数组
    


2. 创建数组;
    1. 直接通过给数组初始化元素的方式创建数组



:+ 一般用于给不可变的集合添加单个元素在末尾  (+)
+: 一般用于给不可变的结集合加单个元素到头部  (+)
++ 合并连个集合

运算符的结合性:
    1 + 2  左结合
    +2  右集合
    a = 3 右集合
    只要运算符是以: 结尾就是右结合运算符
 */