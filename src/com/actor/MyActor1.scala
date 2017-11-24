package com.actor

import scala.actors.Actor

/**
  * 说明：上面分别调用了两个单例对象的start()方法，他们的act()方法会被执行，相同与在java中开启了两个线程，线程的run()方法会被执行
  * 注意：这两个Actor是并行执行的，act()方法中的for循环执行完成后actor程序就退出了
  *
  */
object MyActor1 extends Actor {

    //重新act方法
    def act(): Unit = {
        for (i <- 1 to 10) {
            println("actor-1" + i)
            Thread.sleep(2000)
        }
    }
}

object MyActor2 extends Actor {

    //重新act方法
    def act(): Unit = {
        for (i <- 1 to 10) {
            println("actor-2" + i)
            Thread.sleep(2000)
        }
    }
}

object ActorTest extends App {
    //启动actor
    MyActor1.start()
    MyActor2.start()
}