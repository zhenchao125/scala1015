package com.atguigu.scalal1015.day01

/**
 * Author atguigu
 * Date 2020/3/2 13:42
 */
object String_1 {
    def main(args: Array[String]): Unit = {
        /*val a = 20
        
        printf("格式化输出 %d", a)
        
        printf("浮点数: %f\n", math.Pi)
        printf("浮点数: %.2f\n", math.Pi)
        printf("字符串: %s, %f, %d", "abc", 1.2, 1)*/
        val a = 10
        val b = 20
        // "a = 10, b = 20"
//        val s = "a = " + a + ", b = " + b
        // s插值
//        val s = s"a = $a, b = $b"
        //val s = s"a = ${a*2}, b = ${b*3}"
        // raw 插值
        val s = raw"\n \t \s"
        println(s)
    
    }
}
/*
1. java的输出
    System.out.println("")
2. scala的输出
    println("")
3. printf
    格式化输出
        %d 输出整数
        %s 输出字符串
        %f 输出浮点数
4. 字符串插值
 
 */