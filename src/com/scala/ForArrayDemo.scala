package com.scala

object ForArrayDemo {
    def main(args: Array[String]): Unit = {
        //初始化一个数组
        val arr = Array(1,2,3,4,5,6,7,8)
        //增强for循环
        for (i <- arr)
            println(i)

        //until会生成一个range（区间）
        //reverse是将生成的range反转
        for (i <- (0 until arr.length).reverse)
            println(arr(i))

    }
}
