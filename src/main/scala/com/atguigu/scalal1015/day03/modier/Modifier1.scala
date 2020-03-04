package com.atguigu.scalal1015.day03.modier

/**
 * Author atguigu
 * Date 2020/3/4 15:21
 */
object Modifier1 {
    def main(args: Array[String]): Unit = {
        val user = new User(10)
        println(user.a)
        
    }
}

// 对主构造器私有
class User private[modier](var age: Int) {
    
    private[modier] val a: Int = 10
    private val b: Int = 10
    
}

/*
权限修饰符:
java:
    public
    protected 同包和子类中使用
    [default] friendly 同包
    private 本类

scala:
    [default] 默认都是public
    protected 只能在子类中使用(同包内不行)
    private
    
 权限修饰的灵活性:
    可以定制
    private[包A]
    包A和包A所以子类都可以访问了
    
 */