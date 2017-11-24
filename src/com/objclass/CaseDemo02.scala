package com.objclass

import scala.util.Random

/**
  * 类型匹配
  */
object CaseDemo02 extends App {
    val arr = Array("hello", 1, 2.0, CaseDemo)
    val v = arr(Random.nextInt(4))
    println(v)
    v match {
        case x: Int => println("Int " + x)
        case y: Double if (y >= 0) => println("Double " + y)
        case z: String => println("String " + z)
        case _ => throw new Exception("not match")
    }
}

object CaseDemo {

}
