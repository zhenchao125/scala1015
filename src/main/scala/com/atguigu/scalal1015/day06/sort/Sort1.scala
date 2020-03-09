package com.atguigu.scalal1015.day06.sort

/**
 * Author atguigu
 * Date 2020/3/9 10:13
 */
class User(val age: Int, val name: String) extends Ordered[User] {
    
    
    override def toString: String = s"[age = $age, name = $name]"
    
    override def compare(that: User): Int = this.age - that.age
}

object Sort1 {
    def main(args: Array[String]): Unit = {
        val user1 = new User(10, "a")
        val user2 = new User(20, "a")
        println(user1 < user2)
        println(user1 <= user2)
        
        /*val list1 = List(30, 50, 70, 60, 10, 20)
        println(list1)
        println(list1.sorted)*/
        
        val list1 = List(new User(10, "a"), new User(20, "b"), new User(20, "a"), new User(15, "c"))
        //        val list1 = List(30, 50, 70, 60, 10, 20)
        // Ordering.Int.reverse 反转Int的类型的比较器
        //       val list2 = list1.sorted(Ordering.Int.reverse)
        
        implicit val o: Ordering[User] = new Ordering[User] {
            override def compare(x: User, y: User): Int = {
                var r = x.age - y.age
                if(r == 0) r = x.name.compare(y.name)
                r
            }
        }
        val list2 = list1.sorted
        println(list2)
        
        
    }
}

/*
冒泡:
    比较两个值的大小
Arrays.sort()
Collections.sort()

Comparable  x.compareTo(y)让元素的类去实现的接口 自己和自己的兄弟对象比较
Comparator compare(x, y) 比较器  比较连个对象
---

scala:
    不管是可变集合还是不可变集合, 都是返回一个新的排好的序集合
    原集合不动
sorted
    默认都是自然排序(升序)
    
    1. 让排序的类型有自己排序的功能
        Ordered  就是java中的 Comparable
    
    2. 找一个第3方的比较器
        Ordering 就是java中的 Comparator

sortBy

sortWith

 */
