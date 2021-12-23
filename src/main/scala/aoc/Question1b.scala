package aoc

import scala.io.Source

object Question1b extends App {
  println("hello")

  var counter = 0
  val bounter = 0

  //val numbers = List(
  //  1, 2, 3, 4, 5, 4, 3, 2, 1, 9, 2, 4, 5, 3, 6, 1, 2, 8, 9, 7, 5, 4, 5, 2, 1
  // )
  val numbers =
    Source.fromFile("/Users/enda/IdeaProjects/AOC2021/Q1.txt").getLines.toList

  /** for { a <- numbers } XXXX
    *
    * a = 1 XXXXX
    * a=2 XXXX
    * a=5 XXXX
    * a = 4 XXX
    */

  for { i <- 0 to numbers.length - 4 } {
    val first = numbers(i).toInt
    val second = numbers(i + 1).toInt
    val third = numbers(i + 2).toInt
    val fourth = numbers(i + 3).toInt

    val one = first + second + third
    val two = second + third + fourth

    if (two > one) {
      counter += 1
    }
    println(one + "<->" + two + "<=-=>" + counter)

  }

  println(counter)
}
