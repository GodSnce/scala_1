package com.test

/**
  * Created by lishanglai on 2017/11/20.
  */
object Demo {

  def main(args: Array[String]): Unit = {
    //使用val定义的变量值是不可变的，相当于java里的final
    val i = 1
    //使用var定义的变量值是可变的
    var s = "hello"
    //scala编译器会自动推断变量的类型，必要的时候可以指定类型
    //变量名在前，类型在后
    val str: String = "scala"

    println(s + str)
  }

}
