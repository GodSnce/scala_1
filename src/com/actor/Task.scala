package com.actor

import java.io.File

import scala.actors.{Actor, Future}
import scala.collection.mutable
import scala.io.Source

class Task extends Actor {
    override def act(): Unit = {
        loop {
            react {
                case SubmitTask(fileName) => {
                    val contents = Source.fromFile(new File(fileName)).mkString
                    val arr = contents.split("\r\n")
                    val result = arr.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.length)
                    sender ! ResultTask(result)
                }
                case StopTask => {
                    exit()
                }
            }
        }
    }
}

object WorkCount {
    def main(args: Array[String]): Unit = {
        val files = Array("f://words.txt", "f://words.log")
        val replaySet = new mutable.HashSet[Future[Any]]
        val resultList = new mutable.ListBuffer[ResultTask]

        for (f <- files) {
            val t = new Task
            val replay = t.start() !! SubmitTask(f)
            replaySet += replay
        }
        while (replaySet.size > 0) {
            val toCumpute = replaySet.filter(_.isSet)
            for (r <- toCumpute) {
                val result = r.apply()
                resultList += result.asInstanceOf[ResultTask]
                replaySet.remove(r)
            }
            Thread.sleep(100)
        }

        val finalResult = resultList.map(_.result).flatten.groupBy(_._1).mapValues(x => x.foldLeft(0)(_ + _._2))
        println(finalResult)
    }
}


case class SubmitTask(fileName: String)

case object StopTask

case class ResultTask(result: Map[String, Int])
