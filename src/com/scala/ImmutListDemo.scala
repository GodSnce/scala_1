package com.scala

/**
  * 不可变的序列 import scala.collection.immutable._
  * 在Scala中列表要么为空（Nil表示空列表）要么是一个head元素加上一个tail列表。
  * 9 :: List(5, 2)  :: 操作符是将给定的头和尾创建一个新的列表
  * 注意：:: 操作符是右结合的，如9 :: 5 :: 2 :: Nil相当于 9 :: (5 :: (2 :: Nil))
  *
  */
object ImmutListDemo {
    def main(args: Array[String]): Unit = {
        //创建一个不可变的集合
        val lst1 = List(1, 2, 3)
        //将0插入到lst1前面生成一个新的List
        val lst2 = 0 :: lst1
        val lst3 = lst1.::(0)
        val lst4 = 0 +: lst1
        val lst5 = lst1.+:(0)

        //将一个元素添加到lst1的后面产生一个新的集合
        val lst6 = lst1 :+ 3

        val lst0 = List(4,5,6)
        //将2个list合并成一个新的list
        val lst7 = lst1 ++ lst0
        //将lis1插入到lst0前面生成一个新的集合
        val lst8 = lst1 ++: lst0

        //将lst0插入到lst1前面生成一个新的集合
        val lst9 = lst1.:::(lst0)

        println(lst9)
    }
}
