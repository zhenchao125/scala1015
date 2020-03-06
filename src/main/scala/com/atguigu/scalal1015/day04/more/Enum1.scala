package com.atguigu.scalal1015.day04.more

import com.atguigu.scalal1015.day04.more.Season.Season
import javax.swing.Spring

/**
 * Author atguigu
 * Date 2020/3/6 11:35
 */
object Enum1 {
    def main(args: Array[String]): Unit = {
        /*val s: Father = Son1
        println(Son1.isInstanceOf[Father])*/
        foo(Season.Spring)
        println(Season.judge(1))
        
    }
    
    def  foo(s: Season) = {
        println(s)
    }
}

object Season extends Enumeration {
    type Season = Value
    val Spring, Summer, autumn, Winter = Value
    
    def judge(month: Int) = {
        if(month >= 1 && month <= 3) Spring
    }
}


sealed abstract class Father

object Son1 extends Father

object Son2 extends Father

object Son3 extends Father

/*
sealed 用来修饰的类叫密封类
将来这类的子类只能出现在当前文件中

1. 模拟枚举
    sealed abstract class Father

    object Son1  extends Father
    object Son2  extends Father
    object Son3  extends Father
    
2. 可以使用java的枚举(更喜欢用这种)
    scala不能写, 只能用java代码去实现, 在scala中调用
    
3. scala也提供了一种官方的枚举
    object Season extends Enumeration
 
 */