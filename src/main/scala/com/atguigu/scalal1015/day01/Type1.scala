package com.atguigu.scalal1015.day01

/**
 * Author atguigu
 * Date 2020/3/2 14:42
 */
object Type1 {
    def main(args: Array[String]): Unit = {
        val a: Unit = 0
        println(a)
    }
}
/*
数据类型:

java:
    基本数据类型
        8大基本数据类型:
            byte   1
            short  2
            char   2
            int    4
            long   8
            float  4
            double 8
            boolean  1(有的用一个字节, 有的用一位)
    
    引用数据类型
        对象类型
        除了基本类型, 都是引用类型
        基本类型=>包装类
        
scala
    所有的数据都是对象!!! 函数也是对象

Any
    AnyVal
        Double
            ...
        Unit(类型)
            对应着java中的void
            只有一个值就是:  ()
            一般用于方法或函数不需要返回值的时候返回值
        StringOps
            看成是String的加强版.
             当使用java的String时候, 一些没有方法, 会自动从这个类型找(隐式转换)
             
    AnyRef
        
        null(关键字) 在java中可以给任何的引用类型赋值
        在scala中:
            Null
                是所有的AnyRef的子类型
                只有一个值: null(其实就是java中的null)
    
    Nothing:
        在scala中, 是所有类型的子类型
        是一个象征意义, 用于辅助类型推导. 一般用于非正常结束情况下的返回值
        
        抛出一个异常
    

 */