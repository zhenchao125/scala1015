package com.atguigu.scalal1015.day05.high

import scala.io.Source

/**
 * Author atguigu
 * Date 2020/3/7 16:15
 */
object WordCoun2 {
    def main(args: Array[String]): Unit = {
        // 读取一个文件的内容, 统计这个文件中,每个单词出现的次数
        val path = """C:\Users\lzc\Desktop\class_code\2019_10_15\01_scala\scala1015\src\main\scala\com\atguigu\scalal1015\day05\high\WordCoun1.scala"""
        // 1. 读文件内容, 放入到集合中   文件中的每一行
        val lines = Source.fromFile(path, "utf-8").getLines().toList
        // 2. 切割单词 使用非单词字符
        val words = lines.flatMap(_.split("\\W+")).filter(_.length > 0)
        // 3. 把相同的单词分组
        val wordGrouped = words.groupBy(w => w)
        // 4. 进行map, 计算每个单词的个数
        /*val wordCount = wordGrouped.map(kv => {
            (kv._1, kv._2.size)
        })*/
//        val wordCount =wordGrouped.mapValues(v => v.size)
        val wordCount =wordGrouped.mapValues(_.size)
        
        println(wordCount)
    }
}
