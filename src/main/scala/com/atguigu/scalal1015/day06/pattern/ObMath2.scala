package com.atguigu.scalal1015.day06.pattern

/**
 * Author atguigu
 * Date 2020/3/9 16:34
 */
object MyArray {
    def unapplySeq(s: String): Option[List[String]] =
       
        if (s != null)
            Some(s.split(",").toList)
        else None
}

object ObMath2 {
    def main(args: Array[String]): Unit = {
        val names = "lisi,zhangsan,wangwu,zhiling,fengjie"
        
        names match {
            case MyArray(a, b, rest@_*) =>
                println(a)
                println(b)
                println(rest)
        }
    }
}

/*
对象匹配的原理:
    对象的 unapply 或 unapplySeq
 
 */