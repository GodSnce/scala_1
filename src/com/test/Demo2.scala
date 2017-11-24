package com.test

/**
  * 在scala中{}可包含一系列表达式，快中最后一个表达式的值就是块的值
  *
  * Created by lishanglai on 2017/11/20.
  */
object Demo2 {

  def main(args: Array[String]): Unit = {
    val x = 0
    val result = {
      if (x < 0){
        -1
      } else if (x >= 1){
        1
      } else {
        "error"
      }
    }
    //result的值就是块表达式的结果
    println(result)
  }

}
