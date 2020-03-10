package com.atguigu.scalal1015.day07.generic

/**
 * Author atguigu
 * Date 2020/3/10 14:23
 */
case class People(age:Int, name: String)
object People{
    implicit val ord: Ordering[People] = new Ordering[People](){
        override def compare(x: People, y: People): Int = x.age - y.age
    }
}

object ContextBound {
    def main(args: Array[String]): Unit = {
        println(max(10, 20))
        println(max("10", "20"))
        println(max(People(10, "a"), People(20, "b")))
    }
    // 让max方法可以比较一个普通的样例类对象
    
    
    def max[T: Ordering](x: T, y: T) = {
        // 从冥界召唤隐式值
        val ord = implicitly[Ordering[T]]
        if(ord.gt(x, y)) x
        else y
    }
    
    
    /*def max[T](x: T, y: T)(implicit ord: Ordering[T]) = {
        // x < y   | 找一个比较器, 去比较x, y Ordering[T]
        if(ord.gt(x, y)) x
        else y
    }*/
}
/*
上下文界定:
    [T: Ordering]
        表示存在一个隐式值: Ordering[T]
        
        得用召唤的方式把隐式召唤出来
        
    等价于: 隐式值 + 隐式参数
上下文:
    环境
 */