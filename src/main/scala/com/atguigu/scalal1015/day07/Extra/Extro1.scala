package com.atguigu.scalal1015.day07.Extra

/**
 * Author atguigu
 * Date 2020/3/10 15:53
 */
class User(var age: Int, var name: String){
    def apply(i: Int)= i match {
        case 0 => age
        case 1 => name
        case _=> throw new IndexOutOfBoundsException("下标越界")
    }
    
    def update[T](i: Int, v: T): Unit = i match{
        case  0 => age = v.asInstanceOf[Int]
        case  1 => name = v.asInstanceOf[String]
        case _ =>
    }
}

object Extro1 {
    def main(args: Array[String]): Unit = {
        /*println(5!)
        
        val a = new RichInt(5)
        println(!a)
        println(a.unary_!)*/
//        val user = new User(10, "lisi")
        /*println(user(0))
        println(user(1))
        println(user(2))*/
       /* user(0) = 100
        user(1) = "zs"
        println(user.age)
        println(user.name)*/
        
        
        /*var f = foo _
        f()
        f.apply()*/
        
//        val a+ = 10  // error
        /*val  a_+ = 10
        println(a_+)*/
        
        
        /*val e: Either[String, Double] = sqrt(10)
        /*if (e.isRight) {
            println(e.right.get)
        }else {
            println(e.left.get)
        }*/
        e match {
            case Left(l) => println(l)
            case Right(r) => println(r)
        }*/
        
        val s = "atguigu"
        println(s(0))  // s.apply(0)
        s.apply(0)
        
    }
    
    def sqrt(d: Double): Either[String, Double] = d match {
        case d if d >= 0 => Right[String, Double](math.sqrt(d))
        case _ => Left[String, Double]("负数不能有平方根")
    }
    
    def foo() = {
        println("foo...")
    }
    
    implicit class RichInt(n: Int){
        def ! = {
            def loop(n: Int): Int =
                if(n == 1) 1
                else n * loop(n - 1)
                
            loop(n)
        }
        // + - ! ~
        def unary_! :Int = -n
    }
    
}
/*
1. 中置运算
    1 + 2
    1 to 100
3. 一元运算符
    后置:
        1 toString
        5!
    前置:
        +5
        -10
        
        这四种前置运算符:
        + - ! ~

3. 运算符的结合性
    重点理解右结合
        =
        : 结尾
        
4. apply方法
    任意对象都可以定义apply'方法,
    对象(...)  === 对象.apply(...)

    1. 伴生对象有apply           Person(a)
    2. 普通的类也可以有apply        new Person()(a)
    3. 调用函数
        val f = 函数
        f()
        f.apply()
5. update 方法
    更新
    
    对象(参数) = 值  === 对象.update(参数, 值)
    
6. _总结
    1. 导入包, 通配符
    2. 元组元素的前缀  t._1
    3. 函数的隐式参数 (占位符)   f(_ + _)
    4. 方法转函数
        def f = ...
        val f1 = f _
    5. 给类的属性设置默认值
        class  ..
            var a: Int = _
    6. 在一个标识符中隔开字符和运算符
          +-...
          a_+
    7. 模式匹配的时候通配符
        case _ =>
    8. 部分应用函数
        val square = math.pow(_, 2)
    9.  分解集合
    
        foo(1,2,3)
        foo(1 to 100: _*)
        def foo(a: Int*)
    10. 模式匹配集合的时候
        Array(rest@_*)
        ...
7. 额外的类
    Option[T]
        语义: 表示值要么存在要么不存在
        Some
        None
        
    Either[T,V]
        语义: 表示值要么正确要么错误
        
        Left  左值: 表示错误的值
        Right 右值: 表示正确的值
        
 

 */