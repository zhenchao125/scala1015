package com.atguigu.scalal1015.day03.homework

/**
 * Author atguigu
 * Date 2020/3/4 8:30
 */
object HomeWork {
    def main(args: Array[String]): Unit = {
        println(sumPrimes(100, 1000))
    }
    
    // 4. 定义函数(方法)判断一个整数是否为质数
    // math.ceil(math.sqrt(n)).toInt
    /*def isPrime(n: Int): Boolean = {
        for(i <- 2 until n){
            if(n % i == 0) return  false
        }
        true
    }*/
    
    def isPrime(n: Int): Boolean = {
        for (i <- 2 until n if n % i == 0) {
            return false
        }
        true
    }
    
    // 5. 定义函数(方法)计算100-10000所有的质数的和
    //        (试着使用我们自定义的 filter 和 reduce 完成)
    /*def sumPrimes(from: Int, to: Int): Int = {
        var sum = 0
        for (n <- from to to if isPrime(n)) sum += n
        sum
    }*/
    
    def sumPrimes(from: Int, to: Int): Int = {
        // filter帮助我们过滤出来质数, 然后把这些质数交给reduce进行求和
//        val ints: Array[Int] = filter(from.to(to).toArray, x => isPrime(x))
        val ints: Array[Int] = filter(from.to(to).toArray, isPrime)  // 这个地方不是在调用isPrime, 是把isPrime当成一个函数传递
        reduce(ints, (x, y) => x + y)
//        println(reduce(ints, _ + _))
    
    }
    
    def reduce(arr: Array[Int], op: (Int,Int) => Int): Int = {
        var lastReduce: Int = arr(0)
        for(i <- 1 until arr.length){
           lastReduce =  op(lastReduce, arr(i))
        }
        lastReduce
    }
    
    def filter(arr: Array[Int], op: Int => Boolean) = {
        for(ele <- arr if op(ele)) yield ele
    }
    
}

/*
scala Day02 作业


1. 会用 for 的各种用法
2. 会用 scala 中关于函数的各种性质:
    定义函数, 类型推断, 参数默认值, 命名参数, 匿名函数, 匿名函数传递简化等
3. 手撸咱们定义的四个高阶函数
4. 定义函数(方法)判断一个整数是否为质数
5. 定义函数(方法)计算100-10000所有的质数的和
        (试着使用我们自定义的 filter 和 reduce 完成)
 */