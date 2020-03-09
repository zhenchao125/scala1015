package com.atguigu.scalal1015.day06.pattern


/**
 * Author atguigu
 * Date 2020/3/9 15:53
 */
class A(val age: Int, val name: String)

object People {
    def unapply(pp: A): Option[(Int, String)] =
        if (pp != null)
            Some(pp.age, pp.name)
        else None
}

object ObjMatch {
    def main(args: Array[String]): Unit = {
        val p = new A(10, "zhiling")
        
        p match {
            case People(age, name) => println(age, name)
            case _ =>
        }
    }
}

/*
    case People(age, name) =>
    回去调用 People 伴生对象的unapply

 */