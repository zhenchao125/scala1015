package com.atguigu.scalal1015.day04.traitdemo

/**
 * Author atguigu
 * Date 2020/3/6 10:10
 */
object Trait1 {
    def main(args: Array[String]): Unit = {
        val usb: Logger = new HuaweiUsb
        /*usb.insert
        usb.work*/
        usb.print()
        
    }
}

class Logger{
    println("logger 类的构造器")
    
    def print() = {
        println("开始打印日志...")
    }
}

trait Usb{
    println("Usb 的构造器  第一个混入的")
    // 抽象字段
    val name: String
    def insert: Unit
    def work: Unit
    def pop: Unit
    
    def init()= {
        println(s" $name 开始初始化...")
    }
}
trait MyException{
    println("MyException 的构造器  第二个混入的")
    // 抽象字段
    def thowExec: Exception
}
class HuaweiUsb extends Logger with MyException with Usb {
    println("HuaweiUsb 类的构造器  子类")
    override val name: String = "huawei"
    
    override def insert: Unit = {
        println("华为 usb开始插入...")
        init()
    }
    
    override def work: Unit =
        println("华为 usb开始工作...")
    
    override def pop: Unit =
        println("华为 usb退出工作...")
    
    override def thowExec: Exception = new RuntimeException("华为的usb在抛异常")
}


/*
java:
    类
    静态 (伴生对象中的)
    抽象类
    内部类
    接口(1.7 常量和抽象方法)
        1.8 默认方法
scala:
    trait
    scala没有提供接口, 但是提供了一个更加强大的: trait 特质
    将来一定会有接口,
    
    1. 抽象类中有的东西, trait都可以有.
            抽象类是类, 所以只能单继承
            trait 可以多继承

    2. 当类继承类和trail, 对前面用extends, 后面的统一用with(混入)
    

 */