package com.atguigu.scalal1015.day02.loop

/**
 * Author atguigu
 * Date 2020/3/3 9:11
 */
object For2 {
    def main(args: Array[String]): Unit = {
        // 输出1-100所有的奇数
        // 循环守卫
        /*for (i <- 1 to 100 if i % 2 == 1) {  // [1, 100]
            println(i)
        }
        */
        
        // 0-99  for( ;i < 100;) for(;i <=99;)
        /*for (i <- 0 until 100) {   // [0, 100)
            println(i)
        }*/
        // 引入其他变量
        /*for (i <- 1 to 100 if i % 2 == 0; j = i * i if j < 10000; k = j * j if k < 1000) {
            
            println(s"i=$i, j=$j, k=$k")
        }*/
        
        
    }
}
