package com.atguigu.scalal1015.day04.implicitdemo

import java.io.File

import scala.io.Source


/**
 * Author atguigu
 * Date 2020/3/6 14:07
 */
object Implicit2 {
    def main(args: Array[String]): Unit = {
        implicit def file2RichFile(file: File): RichFile = new RichFile(file)
        
        val content: String = new File("C:\\Users\\lzc\\Desktop\\class_code\\2019_10_15\\01_scala\\scala1015\\src\\main\\scala\\com\\atguigu\\scalal1015\\day04\\implicitdemo\\Implicit2.scala")
            .readContent
        println(content)
    }
}

class RichFile(file: File) {
    def readContent: String = {
        Source.fromFile(file, "utf-8").mkString
    }
}

/*
File 只是封装了文件的元数据., 文件内容必须通过IO
 */