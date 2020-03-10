package com.atguigu.scalal1015.day07.Exceptiondemo

import java.io.{FileInputStream, IOException}

import scala.io.StdIn



/**
 * Author atguigu
 * Date 2020/3/10 10:35
 */
object ExecptionDemo1 {
    def main(args: Array[String]): Unit = {
        val i = StdIn.readInt()
        if(i == 0) throw new ArithmeticException("除数不能是0")
        
        
        try {
//            var i = 1 / 1
//            new FileInputStream("aa")
            
        }catch{
            case e: ArithmeticException =>
                println("发生算术异常")
            case e:Exception =>
                println("运行时异常")
            case _ =>
        }finally {
            //不管有没有异常, 都会走这里
            println("释放资源")
        }
        println("aaa")
        
        //----
        try{
            foo()
        }catch {
            case e: IOException =>
        }
    }
    
    @throws(classOf[IOException])
    @throws(classOf[RuntimeException])
    def foo() = {
        println("aaaa")
    }
}

/*
在scala中, 不强制要求必须处理异常

如何处理异常:
    1. 抛出异常类型
        throws 异常类型
    2. try
    
抛出异常对象:
    throw new 异常对象
    
 

java:
    运行时异常
        可以不用提前处理, 将来运行的时候可能会抛异常
    受检异常(checked)
        在编译阶段, 异常必须被处理
            1. try
            2. 抛出异常类型 throws 异常类
 */