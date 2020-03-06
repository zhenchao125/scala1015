package com.atguigu.scalal1015.day04.factory

import scala.collection.mutable

/**
 * Author atguigu
 * Date 2020/3/6 9:49
 */
object Factory1 {
    def main(args: Array[String]): Unit = {
        println(Human.getHuman("黑色"))
        println(Human.getHuman("黑色"))
       
        
        
    }
}

object Human{
    
    val map = mutable.Map[String, Human](
        "黑色" -> new Human("黑色")
    )
    
    def getHuman(color: String) = map.getOrElseUpdate(color, new Human(color))
}

class Human private (color: String){
    
    println(s"$color.....")
    
    override def toString: String = s"人种: $color"
}
/*
1. 伴生类和伴生对象可以互相访问对方的私有成员!!!
2. 编译成字节码之后, 伴生对象中的成员就是java中的静态成员, 伴生类中的成员, 就是java中的普通成员
 */


/*
伴生类和伴生对象的用法:
    静态工厂
 */
