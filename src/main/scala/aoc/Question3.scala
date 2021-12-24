package aoc

import scala.io.Source

object Question3 extends App {
  val lines =
    Source.fromFile("/Users/enda/IdeaProjects/AOC2021/Q3.txt").getLines.toList

//  val ints = lines.map(line => line.toInt)
//  val short = lines.filter(line => line.length < 2)
//  val shortCount = lines.count(line => line.length < 2)

  def foo(n: Int): Int = n * 4
  // n => n * 4

  // returns which character occurs most commonly in column [pos]
  def MCD(pos: Int): Char = {
    val ones = lines.count(line => line.charAt(pos) == '1')
    val zeroes = lines.length - ones
    if (ones > zeroes) '1' else '0'
  }

  val indices = (0 until 12).toList
  val mcds = indices.map(index => MCD(index))
  val mcdStr = mcds.mkString
  val gr = Integer.parseInt(mcdStr, 2)
  val lcds = mcds.map(mcd => if (mcd == '1') '0' else '1')
  val lcdStr = lcds.mkString
  val er = Integer.parseInt(lcdStr, 2)
  val answer = gr * er

  println("gr: " + mcdStr + " " + gr)
  println(s"er: $lcdStr $er")
  println(answer)
}
