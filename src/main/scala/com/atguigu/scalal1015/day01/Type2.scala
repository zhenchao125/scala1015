package com.atguigu.scalal1015.day01

/**
 * Author atguigu
 * Date 2020/3/2 15:24
 */
object Type2 {
    def main(args: Array[String]): Unit = {
        /*val a: Long = 1
        val b : Double = a*/
        /*val a = 1L
        val long: Long = a.toLong*/
        val s = "123"
//        val i: Int = Integer.parseInt(s)
//        println(i)
        println(s.toInt)
        println(s.toDouble)
    
        println(123.toString)
    }
}
/*
值类型之间的转换:
 Byte
 Short
 Long
 Int
 Float
     ...
       自动转换(提升):
            byte->short->int->long->float->double
                   char->int
                   scala中照样是适用
       
       强制转换:
            java:   (int)1L
            scala:
                    .toInt
                    .toDouble
                    
       字符串中, 如果是纯数字, 也可以轻易转换成相应的类型:
        "123" -> 123
            java:
                Integer.parseInt("123")
            scala:
                "123".toInt
                
        如何转成字符串:
            123 + ""
            123.toString
            

引用类型的转换:
    遵守面向对象的规则. 多态
 */