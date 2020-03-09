package com.atguigu.scalal1015.day06.pattern

object PatternDemo2 {
    def main(args: Array[String]): Unit = {
        /*val a: Any = 20
        a match {
            case 20 => println(20)
                // case语句新声明的变量,
            case aa => println(aa)
            
        }*/
        val aA = 20
        
        val a = 20
        a match {
//            case aA => println(aA)
//            case `aA` => println(aA)
            case _ =>
            
        }
    }
}
/*
case aa
    aa是新声明的, 只能在这个case内使用
    
case Ba
    变量是大写字母开头, scala任务这个变量是一个常量, 必须是已经定义好的常量
    
    匹配常量:
        1. 首字母大写
        2. `aA`
case _
    本质就是匹配变量, 只是把变量的名字省略了
    
 */
