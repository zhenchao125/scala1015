package com.atguigu.scalal1015.day05.arr

import scala.collection.mutable.ArrayBuffer

/**
 * Author atguigu
 * Date 2020/3/7 9:05
 */
object Array2 {
    def main(args: Array[String]): Unit = {
        // ArrayBuffer.apply(1,2,3,4)
        //        val buffer2 = new ArrayBuffer[Int]()
        
        val buffer1: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 1)
        val buffer2: ArrayBuffer[Int] = ArrayBuffer(1, 2, 30, 40)
        //       val b2 = 100 +: buffer1 :+ 10
        //        println(buffer1)
        // 原地修改buffer1, 在他的尾部添加元素
//        buffer1 += 100
//        200 +=: buffer1  //
//        println(buffer1)
        
//        val b3 = buffer1 ++ buffer2
        
//        buffer1 ++= buffer2  // 把buffer2 的集合追加到buffer1的后面, 更新的是buffer1
        // buffer2.++:(buffer1)
//        buffer1 ++=: buffer2  // 把buffer1的元素添加到buffer2的前面, 更新的是buffer2
        
//        buffer1 -= 1
        
//        buffer1 --= buffer2
//        buffer1 -= (1,2,3)  // 已经不推荐使用了

//        println(buffer1)
        
        
    }
}

/*
可变数组:
    ArrayBuffer
    创建:
    1. ArrayBuffer(1,2,3)
    2. new ArrayBuffer[Int]()
    
    
:+
+:
++

一般用于可变集合, 表示原地修改集合
+=  尾部
+=: 头部

++= 把后面的集合的元素合并到前面的集合中
++=:
-= 删除元素, 只删除满足的第一个  (set用的比较多)
--= 求差集

    
 */