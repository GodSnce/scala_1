package com.test

/**
  * Created by lishanglai on 2017/11/20.
  */
object Demo1 {

  def main(args: Array[String]): Unit = {
    val x = 1
    //判断x值，将结果给y
    val y = if (x > 0) 1 else -1
    //打印y
    println(y)

    //支持混合类型表达式
    val z = if (x > 1) 1 else "error"
    println(z)

    //如果没有else，相当于else ()
    val m = if (x > 2) 1
    println(m)

    //在scala中每个表达式都有值，scala中有个unit类，写作()，相当于java中的void
    val n = if (x > 2) 1 else ()
    println(n)


    val k = if (x < 0) 0
    else if (x >= 1) 1 else -1
    println(k)

  }

}
