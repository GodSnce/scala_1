package com.objclass

/**
  * 在scala的类中，与类名相同的对象叫做伴生对象，类和伴生对象之间可以相互访问私有的方法和属性
  */
class Dog {
    val id = 1
    private var name = "hello"

    def printName(): Unit = {
        //在dog类中可以访问伴生对象dog的私有属性
        println(Dog.CONSTANT + name)
    }
}

object Dog {
    //伴生对象中的私有属性
    private val CONSTANT = "叫"

    def main(args: Array[String]): Unit = {
        val p = new Dog
        //访问私有的字段name
        p.name = "123"
        p.printName()
    }
}
