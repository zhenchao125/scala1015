package com.atguigu.scalal1015.day07.homework

/**
 * Author atguigu
 * Date 2020/3/10 8:47
 */
object Homework {
    def main(args: Array[String]): Unit = {
        //        work8()
        //        work9()
        //        work10()
//        work11()
        work12()
    }
    
    def work8() = {
        // 利用模式匹配，编写一个 swap(arr: Array[Int]) 函数，交换数组中前两个元素的位置
        
        def swap(arr: Array[Int]) = {
            arr match {
                case Array(a, b, rest@_*) => Array(b, a) ++ rest
            }
        }
        
        val arr = swap(Array(1, 2, 3, 4, 5))
        println(arr.mkString(", "))
    }
    
    def work9() = {
        //9. 编写一个函数，计算 List[Option[Int]] 中所有非None值之和。分别使用 match 和不适用 match 来计算
        def sum1(list: List[Option[Int]]) = {
            var sum = 0
            list.foreach(op => {
                if (op.isDefined) sum += op.get
            })
            sum
        }
        
        def sum2(list: List[Option[Int]]) = {
            // 想到聚合函数  reduce  返回值的类型, 要和集合中的类型一致
            list.filter(_.isDefined).map(_.get).reduce(_ + _)
        }
        
        def sum3(list: List[Option[Int]]) = {
            // 想到聚合函数  reduce foldLeft
            list.foldLeft(0)(_ + _.getOrElse(0))
        }
        
        
        println(sum3(List(Some(10), None, Some(20), Some(20))))
    }
    
    
    def work10() = {
        val list: List[Any] = List(List(3, List(10, 20)), 2, List(5))
        
        def sum1(list: List[Any]): Int = {
            var sum = 0
            list.foreach(x => x match {
                case a: Int => sum += a
                case list: List[_] => sum += sum1(list)
            })
            sum
        }
        
        // 这个函数式用来计算list中所有的int的值
        def sum2(list: List[Any]): Int = {
            list.foldLeft(0)((x, y) => x + (y match {
                case a: Int => a
                case list: List[_] => sum2(list)
            }))
        }
        
        
        println(sum2(list))
        
    }
    
    def work11() = {
        /*
        11.  如果使用样例会更好一些, 从二叉树开始
        sealed abstract class BinaryTree
        case class Leaf(value : Int) extends BinaryTree
        case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree
        编写一个函数计算所有叶子节点的元素的和
         */
        val r: BinaryTree = Node(Leaf(8), Node(Node(null, Leaf(20)), Leaf(9)))
        
        def sum1(node: BinaryTree): Int = {
            node match {
                case Leaf(v) => v
                case Node(left, right) => sum1(left) + sum1(right)
                case _ => 0
            }
        }
        println(sum1(r))
    }
    
    def work12() = {
        /*
        12. 附加题(认为自己够牛逼的可以完成下):
            大公司面试题: 使用递归
            假设某国的货币有若干面值，现给一张大面值的货币要兑换成零钱，问有多少种兑换方式
            
            动态规划:
                针对第一种硬币来说:
                    1. 包含
                    2. 不包含
                    
               出口:
                1. money < 0   或 硬币是0
                    0种换法
                2. money = 0
                    1中换法
                递归条件
                    change(money, coins.tail) + change(money - coins.head, coins)
                
         */
        def change(money: Int, coins: Array[Int]):Int = {
            if(money < 0 || coins.isEmpty) 0
            else if(money == 0) 1
            // 不包含第一种 + 包含第一种
            else change(money, coins.tail) + change(money - coins.head, coins)
        }
    
        println(change(11, Array(1, 2, 5, 10)))
}
    
}

sealed abstract class BinaryTree

case class Leaf(value: Int) extends BinaryTree

case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

/*
8. 利用模式匹配，编写一个 swap(arr: Array[Int]) 函数，交换数组中前两个元素的位置
9. 编写一个函数，计算 List[Option[Int]] 中所有非None值之和。分别使用 match 和不适用 match 来计算
10. 我们可以用列表制作只在叶子节点存放值的树。举例来说，列表((3 8) 2 (5)) 描述的是如下这样一棵树：
        *
       /|\
      * 2 *
     /\   |
    3  8  5
    List[Any] = List(List(3, 8), 2, List(5))
    不过，有些列表元素是数字，而另一些是列表。在Scala中，你必须使用List[Any]。
    编写一个leafSum函数，计算所有叶子节点中的元素之和.

11.  如果使用样例会更好一些, 从二叉树开始
    sealed abstract class BinaryTree
    case class Leaf(value : Int) extends BinaryTree
    case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree
    编写一个函数计算所有叶子节点的元素的和
    val r = Node(Leaf(8), Node(Leaf(3), Leaf(9)))
12. 附加题(认为自己够牛逼的可以完成下):
    大公司面试题: 使用递归
    假设某国的货币有若干面值，现给一张大面值的货币要兑换成零钱，问有多少种兑换方式
 */