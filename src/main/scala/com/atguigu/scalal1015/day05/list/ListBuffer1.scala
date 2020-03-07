package com.atguigu.scalal1015.day05.list

import scala.collection.mutable.ListBuffer

/**
 * Author atguigu
 * Date 2020/3/7 9:46
 */
object ListBuffer1 {
    def main(args: Array[String]): Unit = {
        val buffer = ListBuffer(1, 2, 3)
        buffer += 10
        100 +=: buffer
        println(buffer)
        
    }
}
