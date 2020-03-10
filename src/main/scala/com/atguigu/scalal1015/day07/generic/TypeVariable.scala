package com.atguigu.scalal1015.day07.generic

/**
 * Author atguigu
 * Date 2020/3/10 14:57
 */
// 集合
/*class MyList[+T](t: T) {
    // 参数位置是逆变点
    //    def foo(t: T) = {}  // error
    
//    def foo(): T = t  // ok
}*/


class MyList[-T](t: T) {
    
    //    def foo(t: T) = {} // ok
    
    def foo[A <: T](a: A): A = a // OK
}

class Father

class Son extends Father

object TypeVariable {
    def main(args: Array[String]): Unit = {
//        val a: Father = new Son // Ok
        
        //        var fList: MyList[Father] = new MyList[Son]
        
        //        val sList : MyList[Son] = new MyList[Father]
        
        val list: List[Father] = List[Son]()
//        val arr: Array[Father] = Array[Son]()
    
    }
}


/*
泛型的型变:
    不变 invariant
        [T]
        子类型的集合对象, 不能赋值给父类型的集合引用
        默认都是不变
    协变 Covariant
        [+T]
        子类型的集合对象, 可以赋值给父类型的集合引用
    逆变 contravariant
        [-T]
        父类型的集合对象, 可以赋值给子类型的集合引用

def mkString(list: List[Int], start: String, sep: String, end: String) = {
    
    val mid = list.foldLeft("")(_ + sep + _).substring(sep.length)
    s"$start${mid}$end"
}
 */