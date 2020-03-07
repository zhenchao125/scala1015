package com.atguigu.scalal1015.day05.queue
import scala.collection.mutable
/**
 * Author atguigu
 * Date 2020/3/7 11:24
 */
object Queue1 {
    def main(args: Array[String]): Unit = {
        /*val q1: mutable.Queue[Int] = mutable.Queue[Int](10, 20, 30)
        q1.enqueue(100, 200)
        val v = q1.dequeue()
        println(q1)
        println(v)*/
        val s1: mutable.Stack[Int] = mutable.Stack[Int](10, 20, 30)
        println(s1)
        val p: Int = s1.pop()
        s1.push(100)
        val p2: Int = s1.pop()
        println(p2)
        
    }
}
/*
队列:
    FIFO
    提供了两个专门操作队列的元素:
        入队
        出队

栈:
    FILO
    专门操作栈的元素
        push 入栈
        pop  出栈
        
     栈顶和栈底


 */