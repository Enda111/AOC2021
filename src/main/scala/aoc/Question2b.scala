package aoc

import scala.io.Source

object Question2b extends App {

  val ForwardRE = "forward (.*)".r
  val UpRE = "up (.*)".r
  val DownRE = "down (.*)".r

  val lines =
    Source.fromFile("/Users/enda/IdeaProjects/AOC2021/Q2.txt").getLines.toList
  var forward = 0
  var up = 0
  var down = 0
  var aim = 0
  var depth = 0

  for (i <- 0 to lines.length - 1) {
    val line = lines(i)
    line match {

      case UpRE(numPart)   => aim = aim - numPart.toInt
      case DownRE(numPart) => aim = aim + numPart.toInt
      case ForwardRE(numPart) => {
        forward = forward + numPart.toInt
        depth = depth + (numPart.toInt * aim)
      }
      case unknown => println(s"Unknown: $unknown")
    }

  }
  val answer = depth * forward
  println(answer)
}
