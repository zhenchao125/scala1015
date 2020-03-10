package com.atguigu.scalal1015.day07.generic
// ctrl + h 打开继承结构
class Animal {
    val name: String = "Animal"
}

class Pet extends Animal {

}

class Dog extends Pet {
    override val name: String = "dog"
}

class Cat extends Pet {
    override val name: String = "cat"
}

class Lion extends Animal {
    override val name: String = "lion"
}

object TestGeneric {
    
   
    def main(args: Array[String]): Unit = {
        val dog: Dog = new Dog()
        val cat: Cat = new Cat()
        val lion: Lion = new Lion()
        
        print(new Pet())
        print(new Animal())
        print(new Object())
        
        print(dog)
        print(1)
    }
    
    def print[P >: Pet](p: P) = {
    
    }
    
    /*def print[P <: Pet](p : P) = {
        println(p.name)
    }*/
}



