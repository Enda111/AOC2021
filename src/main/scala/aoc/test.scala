package aoc

object test extends App {
  var x = 0
  var y = 1

  for (i <- 0 to 15) {
    println(x)
    println(y)
    x = x + y
    y = y + x
  }

}
