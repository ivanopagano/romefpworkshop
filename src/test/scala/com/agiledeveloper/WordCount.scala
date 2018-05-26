package com.agiledeveloper

import scala.io.Source
import java.io._
import java.nio.file.{ Paths, Path }


object WordCount {
  def count(path: String, searchWord: String): Long =
    try {
      val resources = Paths get "src/test/resources"
      val file = resources.resolve(path).toFile

      Source.fromFile(file)
        .getLines
        .filter(_.contains(searchWord))
        .size
    } catch {
      case ex: IOException =>
        throw new RuntimeException(new FileNotFoundException(ex.getMessage))
    }
}
