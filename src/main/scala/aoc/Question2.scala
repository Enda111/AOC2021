package aoc

import scala.io.Source

object Question2 extends App {

  val ForwardRE = "forward (.*)".r
  val UpRE = "up (.*)".r
  val DownRE = "down (.*)".r

  val lines =
    Source.fromFile("/Users/enda/IdeaProjects/AOC2021/Q2.txt").getLines.toList
  var forward = 0
  var up = 0
  var down = 0

  for (i <- 0 to lines.length - 1) {
    val line = lines(i)
    line match {
      case ForwardRE(numPart) => forward = forward + numPart.toInt
      case UpRE(numPart)      => up = up + numPart.toInt
      case DownRE(numPart)    => down = down + numPart.toInt

      case unknown => println(s"Unknown: $unknown")
    }

  }
  val depth = down - up
  val answer = depth * forward
  println(answer)
}
