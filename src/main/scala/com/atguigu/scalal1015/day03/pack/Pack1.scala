package com.atguigu.scalal1015.day03.pack




//import java.util._
//import java.util.HashMap
//import java.util.TreeMap
//import java.util.{TreeMap, HashMap}

// 导包的时候给类起别名
//import java.util.{HashMap=>jHashMap}
//import java.util.{HashMap=>_}

// 不想用HashMap(屏蔽HashMap), 其他都想用

import java.util.{HashMap => _, _}
/**
 * Author atguigu
 * Date 2020/3/4 14:39
 */
object Pack1 {
    def main(args: Array[String]): Unit = {
    
    }
}
class A{

}
package aa{
    class A
    
}

/*
scala也有包, 包的命名使用规则和java完全一样!!!

1. 包的声明
    1) package com.atguigu.scalal1015.day03.pack
    2) 包语句
        在scala'中, 一个 .scala文件中一般会写多个类.所有的类会默认在一个包中
        
        package aa{
            class A
        }

2. 包的使用
    如何导包和导类
    1) 在文件的最顶层导
        import java.util.HashMap
        
   2) 在代码的任何的需要的地方导包
       比如可以在方法的内部
       
    3)通配符导入
        import java.util._
        
        //import java.util.{TreeMap, HashMap}
        
        // 导包的时候给类起别名
        import java.util.{HashMap=>jHashMap}
       
       // 不想用HashMap(屏蔽HashMap), 其他都想用

       import java.util.{HashMap => _, _}

 */