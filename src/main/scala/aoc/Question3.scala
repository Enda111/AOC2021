package aoc

import scala.io.Source

object Question3 extends App {

  val lines =
    Source.fromFile("/Users/enda/IdeaProjects/AOC2021/Q3.txt").getLines.toList

  var firstCounter = 0

  for (i <- 0 to lines.length - 1) {
    val line = lines(i)
    val first = line.charAt(0)
    if (first == '1') {
      firstCounter = firstCounter + 1
    }
  }
  if (firstCounter > lines.length / 2) {
    println("1")
  } else {
    println("0")
  }

}
