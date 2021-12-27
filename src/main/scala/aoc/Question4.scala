package aoc

import scala.io.Source

object Question4 extends App {
  val input =
    Source.fromFile("/Users/enda/IdeaProjects/AOC2021/Q4.txt").getLines.toList
  val draws = input.head
  val boardlist = input.tail
  val boards = boardlist.filter(char => char != ",")

  println(s"draws: $draws")
  println(s"boards: $boards")

}
