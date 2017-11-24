package com.scala

import scala.collection.mutable.ArrayBuffer

/**
  * 可变的序列 import scala.collection.mutable._
  */
object MutListDemo extends App {

    //构建一个可变列表,初始3个元素1,2,3
    val lst0 = ArrayBuffer[Int](1, 2, 3)
    //创建一个空的可变列表
    val lst1 = new ArrayBuffer[Int]
    //向lst1中追加元素，注意：没有生成新的集合
    lst1 += 4
    lst1.append(5)
    println(lst1)

    //将list1中的元素放到list0中，注意：没有生成新的集合
    lst0 ++= lst1

    //将lst0和lst1合并成一个新的listbuffer 注意：生成了一个新的集合
    val lst2 = lst0 ++ lst1
    println(lst2)

    //将元素追加到lst0的后面生成一个新的集合
    val lst3 = lst0 :+ 5

    println(lst3)

}
