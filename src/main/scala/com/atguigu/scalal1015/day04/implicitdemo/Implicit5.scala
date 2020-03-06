package com.atguigu.scalal1015.day04.implicitdemo

/**
 * Author atguigu
 * Date 2020/3/6 15:09
 */
object Implicit5 {
    implicit val aa = 100
//    implicit val bb: Double = 200
    
    def main(args: Array[String]): Unit = {
        //        foo(10, 100)
        //        foo
        
//        foo(2)
        
        foo  /// 先隐式值, 没有了再去默认值
        foo()  // 默认值
    }
    
    def foo(implicit a: Int = 10) = {
        println(a)
    }
    
    
    /*def foo(a: Int)(implicit b: Int, c: Double) = {
        println(a + b + c)
    }*/
    
    /*// a就是隐式参数
    def foo(implicit a: Int, b: Double) = {
        println(a)
    }*/
}

/*


隐式转换
    1. 隐式转换函数
        implicit def double2Int(d: Double) = d.toInt
        不看函数名, 只看参数和返回值类型
        
        将来可以给已有的类增加功能!
    
    
    2. 隐式类
        implicit class RichFile(file: File) {
        def readContent: String = {
            Source.fromFile(file, "utf-8").mkString
            }
        }
        1. 不能顶级
        2. 柱构造必须有参数
        
        2.10新增的, 是对隐式转换函数的一个封装. 简化隐式转换函数的使用.
        spark里面, 其实还是隐式转换函数用的比较多
        
        可以把隐式当做一个普通的类使用!!!
        
    
    3. 隐式参数和隐式值
        隐式参数是指的给函数的参数添加隐式关键字
        
        implicit val aa = 100
        
        def foo(implicit a: Int)
        
        当调用函数的时候, 如果不传参数, 并且省略括号, 就会找隐式值!(只看类型,不看名字)
        
        如果定义了隐式参数, 则整个参数列表中所有的参数都是隐式参数
    

 */
