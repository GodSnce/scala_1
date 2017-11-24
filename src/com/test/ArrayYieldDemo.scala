package com.test

/**
  * 数组转换
  *
  * Created by lishanglai on 2017/11/20.
  */
object ArrayYieldDemo {

    def main(args: Array[String]): Unit = {
        //定义一个数组
        val arr1 = Array(1,2,3,4,5,6,7,8,9)
        //将偶数取出乘以10后再生成一个新的数组
        val res = for (e <- arr1 if e % 2 == 0) yield e * 10
        println(res.toBuffer)


        //更高级的写法,用着更爽
        //filter是过滤，接收一个返回值为boolean的函数
        //map相当于将数组中的每一个元素取出来，应用传进去的函数
        val arr2 = arr1.filter(_ % 2 == 0).map(_ * 10)
        println(arr2.toBuffer)
    }

}
