package com.scala

import scala.collection.immutable.HashSet
/**
  * 不可变的set
  */
object ImmutSetDemo extends App {

    val set1 = new HashSet[Int]()
    //将元素和set1合并生成一个新的set，原来set不变
    val set2 = set1 + 4
    println(set2)
    //set中元素不能重复
    val set3 = set1 ++ Set(5,6,7)
    println(set3)
    val set0 = Set(1,3,4) ++ set1
    println(set0)

}
