package com.atguigu.scalal1015.day01

/**
 * Author atguigu
 * Date 2020/3/2 15:36
 */
object Operator1 {
    def main(args: Array[String]): Unit = {
        /*val r: Int = 1.+(2)
        println(r)*/
        
        /*var i = 1
        i += 1
        println(i)*/
        var a = "a"
        var ab1 = a + "b"
        var ab2 = a + "b"
        println(ab1.equals(ab2))
    
        println(ab1.eq(ab2))
    }
}

/*
运算符:
    在scala中, 没有真正的运算符. 所谓运算符, 其实是一个方法(函数)名!!!
   
   +-/ 都是方法名
   
   1. 在scala中, 调用方法的点.可以省略
   2. 在给方法传递参数的时候, 如果这个方法的参数只有一个参数或者没有参数, 则愿括号也可以省略
        .和()都省略后, 这个时候的方法名我们就称为运算符
   
 ++  -- 这两个垃圾运算符被去掉.
 
 关于比较相等:
    java:
        ==
            基本类型比较的就是值
            引用类型: 比的也是值: 对象的地址值
        equals
            只能用户引用类型.
            比较的内容
            
    scala:
        ==  等价于 equals   (!=)
        equals 等价于 ==
            自定义类型应该覆写equals.
                不要忘记覆写一下hashCode, 这两个返回要一致(hashCode相等的两个对象, 应该equals返回true)
        eq  等价于java的 ==  只能用于AnyRef  (ne)
    
 
 快捷键:
  1. alt + enter 万能键
  
  2. 双击shift  打开查找类的对话框
 */
    

