package com.atguigu.scalal1015.day03.obj

import scala.beans.BeanProperty

/**
 * Author atguigu
 * Date 2020/3/4 14:05
 */
object Obj3 {
    def main(args: Array[String]): Unit = {
        //        val lisi = new User3(10, "lisi", "male")
        //        println(lisi.age)
//        val user = new User3
        
        //给类起别名
        type U = User3
        val u = new U(10, "a", "female")
        println(u.age)
        println(u.getClass.getName)
        
    }
}

class User3(@BeanProperty val age: Int, var name: String, sex: String) {
    // 这种构造器: 辅构造器
    def this(){
        // 首行必须是调用主构造器
        this(10, "abc", "male")
    }
    
    def this(c: Int){
//        this()
        this(c, "abc", "male")  // 构造器内调用构造器
        println(c)
    }
    
    
    def eat = {
        println(sex)
        println(this.age)  //站在面向对象的角度
        println(age) // 站在函数式编程的角度
    }
}

/*
1. 调用构造器创建对象的时候, 可以给属性赋值
2. 类名的后面添加需要的一些属性, 这些在创建对象的时候, 可以给这些属性赋值
3. 类名后面根的其实就是构造器. 这个就是主构造器. 一个类有唯一一个
4. def this()
    // 首行必须是调用主构造器
    辅构造的参数, 仅仅是一个只能在当前的这个辅构造内的使用的普普通的一个常量
5. 后面的辅构造可以调用前面的, 前面的不能调用后面的.
 */