package com.atguigu.scalal1015.day06.pattern

object PatternDemo7 {
    def main(args: Array[String]): Unit = {
        val t: Any = ("lisi", 20)
        
        t match {
//            case (name, age) => println(name)
//            case (name: String, age) => println(name)
            case (name: String, age) => println(name)
        }
            
        
    }
}

/*
模式匹配深入到集合的内部:
    有顺序的集合
    
 */