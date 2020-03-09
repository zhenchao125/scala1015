package com.atguigu.scalal1015.day06.pattern

/**
 * Author atguigu
 * Date 2020/3/9 15:00
 */
object PatternDemo5 {
    def main(args: Array[String]): Unit = {
        val arr: Any = List[String]("aaa")
        
        arr match {
            //            case a: Array[Int] => println("Array[Int]")
            //            case a: Array[Double] => println("Array[Double]")
            // 匹配任意数组
            //            case a: Array[_] => println("Array[_]")
//            case a: List[Int] => println("List[Int]")
            case a: List[_]=> println("List[_]")
        }
    }
}
/*
new int[] new String[]
数组在scala中表面用到了泛型, 实际不是泛型

除了数组, 其他的所有泛型都是真正泛型
    泛型模式匹配是无法匹配除了泛型的类型的
    泛型擦除:
        泛型的存在是为了在编译的时候类型更安全
        泛型只存在于源码和编译的时候, 编译成字节码之后, 泛型就不存在
    

 */
