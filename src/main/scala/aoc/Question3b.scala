package aoc

import scala.io.Source

object Question3b extends App {
  val lines =
    Source.fromFile("/Users/enda/IdeaProjects/AOC2021/Q3.txt").getLines.toList

  //  val ints = lines.map(line => line.toInt)
  //  val short = lines.filter(line => line.length < 2)
  //  val shortCount = lines.count(line => line.length < 2)

  def foo(n: Int): Int = n * 4
  // n => n * 4

  // returns which character occurs most commonly in column [pos]
  def MCD(pos: Int, l: List[String]): Char = {
    val ones = l.count(line => line.charAt(pos) == '1')
    val zeroes = l.length - ones
    if (ones >= zeroes) '1' else '0'

  }

  var list = lines
  var position = 0

  while (list.length > 1) {
    list = list.filter(line => line.charAt(position) == MCD(position, list))
    position += 1
    println(list)
  }
  val o = list(0)
  val ogr = Integer.parseInt(o, 2)

  var list2 = lines
  var position2 = 0
  while (list2.length > 1) {
    list2 =
      list2.filter(line => line.charAt(position2) != MCD(position2, list2))
    position2 += 1
    println(list2)
  }
  val c = list2(0)
  val csr = Integer.parseInt(c, 2)

  val answer = ogr * csr

  println(s"ogr: $ogr")
  println(s"csr: $csr")
  println(s"answer: $answer")

}

/*











 */
