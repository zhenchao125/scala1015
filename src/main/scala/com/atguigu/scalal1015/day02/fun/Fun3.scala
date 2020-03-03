package com.atguigu.scalal1015.day02.fun

/**
 * Author atguigu
 * Date 2020/3/3 11:10
 */
object Fun3 {
    def main(args: Array[String]): Unit = {
        //        println(add(10, 20))
        //        foo()
        //        foo
        
        /*foo
        foo*/
        
    }
    
    /*def foo(a: Int) = {
        var b = a
        b += 1
    }*/
    
    
    /*def foo = {
        println("foo...")
    }
    */
    
    /*def foo() = {
        println("foo...")
    }
    */
    
    /*def isOdd(a: Int) = {
        if(a % 2 == 1){
            "是"
        }else{
            false
        }
    }*/
    
    /*def add(a:Int, b:Int) : Unit = {
        a + b
        ""
    }*/
    
    /*def add(a: Int, b:Int) {
        a + b
    }*/
    
    /*def  add(a:Int, b:Int) = {
        a + b
    }*/
}

/*
1. 函数的返回值类型可以省略, 然后scala会根据最后一行代码, 推导出来函数的返回值类型
    一般都是省略
        有些情况不能推导:
        1. 如何函数内有return语句, 则类型不能推导
        2. 返回值类型和推导类型不一致的时候, 不要推
        3. 递归调用的时候不能推
        
2. 如果函数签名和函数体之间的 = 省略, 那么这个函数用于返回 Unit (隐式的返回Unit)
    函数就成了一个过程
 
3. 如果函数显示指明返回Unit, 则用于返回Unit

4. 调用函数的时候, 如果函数的参数的个数是0,则愿括号可以省略

5. 在声明函数时候, 如果不需要参数, 则愿括号也可以省略. 调用时候, 就不能再有愿括号

6. 函数的参数默认都是val, 所以, 在函数内部不能更改参数的值!!!!
    如果想修改参数的值, 则应该定义一个新的局部变量, 然后去修改局部变量的值!
 */