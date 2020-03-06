package com.atguigu.scalal1015.day04.homework

/**
 * Author atguigu
 * Date 2020/3/6 9:12
 */
object Homework1 {
    def main(args: Array[String]): Unit = {
        /*val point:Point = Point(3, 4)  // 伴生对象()  相当于在调用伴生对象的apply方法
        println(point)
        println(point.distance(Point(3, 10)))*/
        
        /*val account = new CheckingAccount(1000)
        println(account.deposit(100))
        println(account.withdraw(100))*/
        
        val rec = new Rectangle(Point(3,4), Point(10, 100))
        println(rec.centerPoint)
        println(rec.area)
        
        val circle = new Circle(Point(0, 0), 100)
        println(circle.area)
        
    }
}

class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    
    def deposit(amount: Double) = {
        balance += amount
        balance
    }
    
    def withdraw(amount: Double) = {
        balance -= amount
        balance
    }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    override def deposit(amount: Double): Double = {
        super.deposit(amount - 1)
    }
    
    override def withdraw(amount: Double): Double = {
        super.withdraw(amount + 1)
    }
}


class Point(val x: Int, val y: Int) {
    override def toString: String = s"x = $x, y = $y"
    
    // 添加一个计算两个点距离的方法
    def distance(other: Point): Double =
        math.sqrt(math.pow(x - other.x, 2) + math.pow(y - other.y, 2))
}

object Point {
    def apply(x: Int, y: Int): Point = new Point(x, y)
}

class Card(val color: String, val num: String) {
    def isRed = color == "♦" || color == "♥"
}


/*
3. 定义一个 Point 类和一个伴生对象,使得我们可以不用 new 而直接用 Point(3,4)来构造 Point 实例
14. 编写一个扑克牌只能有 4 种花色,让其 toString 方法分别返回♣,♦,♥,♠，并实现一个函数,检查某张牌的花色是否为红色
15. 扩展如下的 BankAccount类，新类 CheckingAccount 对每次存款和取款都收取1美元的手续费

    class BankAccount(initialBalance: Double) {
        private var balance = initialBalance

        def deposit(amount: Double) = {
            balance += amount
            balance
        }

        def withdraw(amount: Double) = {
            balance -= amount
            balance
        }
    }
16. 定义一个抽象类 Shape，一个抽象方法 centerPoint，以及该抽象类的子类 Rectangle 和 Circle。
为子类提供合适的构造器，并重写centerPoint方法, 并提供计算面积的方法 (根据需要添加相应的属性)
 */

abstract class shape {
    def centerPoint: Point
    
    def area: Double
}

class Rectangle(leftTop: Point, rightBottom: Point) extends shape {
    override def centerPoint: Point = Point((leftTop.x + rightBottom.x) / 2, (leftTop.y + rightBottom.y) / 2)
    
    def area: Double = ((leftTop.x - rightBottom.x) * (leftTop.y - rightBottom.y)).abs
}

class Circle(center: Point, r: Double) extends shape {
    override def centerPoint: Point = center
    
    override def area: Double = math.Pi * r * r
}
