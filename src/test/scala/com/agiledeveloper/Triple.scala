package com.agiledeveloper

object Triple {
  def getTriple(m: Int, n: Int): String = {   
    val a = m * m - n * n
    val b = 2 * m * n
    val c = m * m + n * n
    
    s"$a $b $c"
  }
  
  def computeTriples(numberOfValues: Int): List[String] = {
    val triples = for {
      m <- (2 to (numberOfValues + 1))
      n <- 1 until m
    } yield getTriple(m, n)

    triples.take(numberOfValues).toList
  }
}