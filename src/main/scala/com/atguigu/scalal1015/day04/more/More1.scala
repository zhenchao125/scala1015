package com.atguigu.scalal1015.day04.more

/**
 * Author atguigu
 * Date 2020/3/6 11:28
 */
object More1 {
    def main(args: Array[String]): Unit = {
       /* val bb = new BB
        println(bb.isInstanceOf[BB])
        println(bb.isInstanceOf[AA])
        println(bb.isInstanceOf[Object])
    
        val aa: AA = bb.asInstanceOf[AA]
        bb.asInstanceOf[Object]
        bb.asInstanceOf[AnyRef]
        bb.asInstanceOf[Any]*/
        
        val a = 10
        a.asInstanceOf[AnyVal]
        println(a.isInstanceOf[Int])
    }
}
class AA
class BB extends AA
/*
类型转换:
    java:
        判断  obj  instanceof 类型
        类型转换   (类型)obj
        
    scala:
       判断 bb.isInstanceOf[BB]
       
       类型转换   bb.asInstanceOf[AA]
      
    
    实际开发的时候, 一般不用这么low的方式, 将来会有更好的: 模式匹配
 */