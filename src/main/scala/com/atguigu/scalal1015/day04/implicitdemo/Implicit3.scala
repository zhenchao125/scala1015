package com.atguigu.scalal1015.day04.implicitdemo

import java.time.LocalDate

object Implicit3 {
    def main(args: Array[String]): Unit = {
        implicit def int2RichDate(day: Int) = new RichDate(day)
        
        //        2 days ago   // 计算2天前是哪一天
        val ago = "ago"
        val later = "later"
//        val r = 2 days ago
        val r = 100.days(later)
        println(r)   // 2020-03-04
        //        4 days later  // 计算4天后是哪一天
    }
}

class RichDate(day: Int) {
    def days(when: String) = {
        if("ago"==when)
            LocalDate.now().plusDays(-day).toString
//            LocalDate.now().minusDays(day)
        else{
            LocalDate.now().plusDays(day).toString
        }
    }
}