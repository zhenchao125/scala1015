package com.atguigu.scalal1015.day01.loop

/**
 * Author atguigu
 * Date 2020/3/2 16:48
 */
object WhileDemo {
    def main(args: Array[String]): Unit = {
        /*var a = 1
        while(a <= 100){
            println(a)
            a += 1
        }*/
        var a = 1
        do{
            println(a)
            a += 1
        }while(a <= 100)
    }
}
/*
循环:
    java:
        while  2
        do...while  3
        for  1
        
        //增强for循环.
        // 其实是在遍历(迭代)  foreach
        for(a: 集合){
        
        }
     
     scala:
        
        while
        
        do...while
            和java完全一样, 没有任何的区别!!!
            
        scala 是一种函数式语言:
            函数式语言中, 不应该有循环!!! 应用用递归
                haskell
        
        for 不是一种循环, 而是一种遍历, 其实是遍历集合中的每个元素
                大家都觉着是循环, 那就是循环吧
    


 */
