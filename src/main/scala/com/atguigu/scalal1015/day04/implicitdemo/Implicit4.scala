package com.atguigu.scalal1015.day04.implicitdemo

import java.io.File

import scala.io.Source

/**
 * Author atguigu
 * Date 2020/3/6 14:59
 */
object Implicit4 {
    def main(args: Array[String]): Unit = {
        
        val content: String = new File("C:\\Users\\lzc\\Desktop\\class_code\\2019_10_15\\01_scala\\scala1015\\src\\main\\scala\\com\\atguigu\\scalal1015\\day04\\implicitdemo\\Implicit4.scala")
            .readContent
        println(content)
    }
    
    // 隐式类必须是内部类
    implicit class RichFile(file: File) {
        def readContent: String = {
            Source.fromFile(file, "utf-8").mkString
        }
        
    }
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
        
    
    3. 隐式参数和隐式值
 */