package com.agiledeveloper

object Maps {

  def listByScore(scores: Map[String, Int]): Map[Int, List[String]] =
    scores.keySet
      .groupBy(scores)
      .mapValues(_.toList)

  def setByScore(scores: Map[String, Int]): Map[Int, Set[String]] =
    scores.keySet
      .groupBy(scores)
      .mapValues(
        _.map(_.toUpperCase)
      )

  def countScores(scores: Map[String, Int]): Map[Int, Int] =
    listByScore(scores)
      .mapValues(_.size)

  def numberOfLetters(scores: Map[String, Int]): Map[Int, Set[Int]] =
    listByScore(scores)
      .mapValues(
        _.map(_.size).toSet
      )

  def maxNumberOfLetters(scores: Map[String, Int]): Map[Int, Int] =
    listByScore(scores)
      .mapValues(
        _.foldLeft(0)((top, next) => next.size max top)
      )

}