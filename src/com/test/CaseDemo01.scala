package com.test

import scala.util.Random

/**
  * 匹配类型
  */
object CaseDemo01 extends App {
    val arr = Array("hello", 1, 2.0, CaseDemo)
    val v = arr(Random.nextInt(4))
    println(v)
    v match {
        case x: Int => println("int" + x)
        case y: Double if (y >= 0) => println("double" + y)
        case z: String => println("string" + z)
        case _ => throw new Exception("not match exception")
    }

}

object CaseDemo{

}
