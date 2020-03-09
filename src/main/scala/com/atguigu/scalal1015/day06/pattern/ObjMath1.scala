package com.atguigu.scalal1015.day06.pattern

/**
 * Author atguigu
 * Date 2020/3/9 16:29
 */
object Sqrt{
    
    def unapply(d: Double) =
        if(d >= 0) Some(math.sqrt(d))
        else None
}
object ObjMath1 {
    def main(args: Array[String]): Unit = {
        // 使用对象匹配的方式把一个数的平方根匹配出来
        
        val d: Double = 9
        
        d match {
            case Sqrt(a) => println(a)
        }
    }
}
