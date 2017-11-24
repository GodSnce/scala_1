package com.objclass

import scala.util.Random

/**
  * 字符串匹配
  */
object CaseDemo01 extends App {
    val arr = Array("YoshizawaAkiho", "YuiHatano", "AoiSola")
    val name = arr(Random.nextInt(arr.length))
    println(name)
    name match {
        case "YoshizawaAkiho" => println("吉泽")
        case "YuiHatano" => println("波多")
        case _ => println("这是啥")
    }
}
