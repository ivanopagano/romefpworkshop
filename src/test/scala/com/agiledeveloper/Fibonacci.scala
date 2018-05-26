package com.agiledeveloper

object Fibonacci {
  def numberAtPosition(position: Int): Int = 
    (Stream.range(0, position)
      .foldRight((0, 1): (Int, Int)) {
        case (_, (curr, next)) => (next, curr + next)
      })._2

  def seriesUntilPosition(position: Int): List[Int] =
    (0 to position).map(numberAtPosition).toList

}


