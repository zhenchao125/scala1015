package com.atguigu.scalal1015.day01

/**
 * Author atguigu
 * Date 2020/3/2 16:16
 */
object IfDemo {
    def main(args: Array[String]): Unit = {
        /*val a = 10
        if(a % 2 == 0) {
            println(s"$a 是偶数")
        }*/
        /* val m = 10
         val n = 20*/
        /*
         var max = m
         if(m > n){
             max = m
         }else{
             max = n
         }*/
        
        /* val max = if (m > n) m else n    // 等价于: m > n ? m :n
         println(max)*/
        
        /*var a = 10
        println(a = 40)*/
        
        /* val m = 99.9
         val s: Double = if (m < 0) {
             throw new IllegalArgumentException("你的参数不对")  // 返回的是 Nothing
         } else {
             Math.sqrt(m)
         }
         println(s)*/
        
        val m = 100
        val n = 50
        val r = if (m > n) {
            1000
        } else 1
    }
}

/*
java:  ? : , scala去掉这些垃圾运算符

重要:
    在scala中, 任意的语法结构(执行的语句, 表达式等等)都有值!!!
    是执行的最后一样代码的值自动返回
    注意:
        1. 在scala中, 赋值的语句的值是Unit  (+= -=...)
        2.




流程控制:
    1. 顺序流程
    2. 分支
        java:
            if分支
                if
                if.. else if
                if.. else if else
                    ...
            switch 分支
                switch(表达式){
                    case 常量:
                        
                        break;
                    default:
                        break;
                }
             缺点:
                1. 类型有限
                    byte short char int String(1.7增加) enum
                    
                2. case穿透
                    忘记break, 会出现
                    
         scala:
            if
                和java的if的使用完全一致! java怎么用, scala还怎么用!
            
            模式匹配:
                替换掉java的switch, 语法有点像, 但是远远超过java的switch
        
    3. 循环
    



 */
