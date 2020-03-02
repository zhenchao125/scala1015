package com.atguigu.scalal1015.day01

import a.A

/**
 * Author atguigu
 * Date 2020/3/2 11:45
 */
object NameRegular {
    def main(args: Array[String]): Unit = {
        /*val ++ = 10
        println(++)*/
        
        //        val a++ = 20  // 错误
        /*val a_++ = 20
        println(a_++)*/
        
        /*val ` fasjlfjol f slfjlsf        ` = 30
        println(` fasjlfjol f slfjlsf        `)*/
        
//        val `type` = 10
        println(A.`type`)
    
        println(A.a)
    }
    
}

/*
标识符(变量, 常量,类, 对象, 方法, 函数)命名规范:
    1. 使用java的命名规则
            数字字母 (下划线) 驼峰(大驼峰:类, 小驼峰))
            scala中的下划线要慎用
            
    2. 不要使用$
            将来scala编译的时候, 一些类会自动添加$
    
    3. 支持使用运算符(+- ...)来命名标识符!!!
         在scala中没有真正的运算符, 所有的运算符其实都是对象的方法
         a: 不要使用单个运算符作为变量名和常量
         b:  字符和运算符不能混用
                a++ 不允许
        c: 如果混用,可以用_隔开
        
     4. 可以使用 ` ` 定义任意的字符. 主要为了java中的一些标识符名
 */

