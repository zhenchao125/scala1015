package com.atguigu.scalal1015.day03.obj

import scala.annotation.meta.beanGetter
import scala.beans.BeanProperty

/**
 * Author atguigu
 * Date 2020/3/4 11:30
 */
object ObjDemo1 {
    def main(args: Array[String]): Unit = {
        val user = new User()
        println(user.age)
        user.age = 200
        println(user.age)
        user.age_$eq(100) // === user.age = 100
        println(user.age)
        
        
        
    }
}

class User {
    // 定义属性:和定义普通的变量完全一样
   @BeanProperty var age = 10
    private var name = "lisi"
   @BeanProperty val country = "china"
    private var a1 = 100
    
    // 给类定义方法
    def eat() = {
        println("eat:" + name)
    }
    
}

/*
java中类: public(文件名和类名一致) 和 默认

scala默认的getter和setter不满足标准的javaBean规范
    getAge()  setAge(...)
    需要注解, 然后scala会自动的生产标准的getter和setter
 */