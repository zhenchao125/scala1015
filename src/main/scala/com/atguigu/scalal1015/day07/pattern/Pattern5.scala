package com.atguigu.scalal1015.day07.pattern

object Pattern5 {
    def main(args: Array[String]): Unit = {
        val opt: Option[Int] = Some(10)
        
        val v = opt match {
            case Some(x) =>
                // 更加复杂的逻辑
                x
            case None => 0
        }
        println(v)
    }
}
