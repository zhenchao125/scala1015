package com.atguigu.scalal1015.day07.pattern

/**
 * Author atguigu
 * Date 2020/3/10 10:04
 */
object Pattern2 {
    def main(args: Array[String]): Unit = {
        val list = List(10, 20, 1, "aa", false)
        
        /*val r = list.filter(_.isInstanceOf[Int]).map(_.asInstanceOf[Int]).sum
        println(r)*/
        
        val f: PartialFunction[Any, Int] = new PartialFunction[Any, Int] {
            // 只对返回值是true的那些元素进行处理, 是false的跳过
            override def isDefinedAt(x: Any): Boolean = x match {
                case a: Int  => true
                case _ => false
            }
            
            // 是true的时候, 交给apply进行处理
            override def apply(v1: Any): Int = v1 match {
                case a : Int => a
            }
        }
        
        // 等价于 filter + map
       val a =  list.collect(f)
        println(a)
        
    }
}

/*
偏函数
   偏的意思: 偏爱
   
 
 */
