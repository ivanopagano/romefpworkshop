package com.agiledeveloper

import java.io._
import org.scalatest._

class WordCountTest extends WordSpec with Matchers {

  "The WordCount" should {
    "fail when given a non-existing file" in {
      val error = the [RuntimeException] thrownBy {
        WordCount.count("nofile", "")
      }
      error.getCause shouldBe a [FileNotFoundException]
    }

    "correctly cound words" in {
      WordCount.count("file1.txt", "lambda") shouldBe 0
      WordCount.count("file2.txt", "lambda") shouldBe 1
      WordCount.count("file3.txt", "lambda") shouldBe 3
      WordCount.count("WordCount.java", "lambda") shouldBe 0
      WordCount.count("WordCountTest.java", "lambda") shouldBe 5
    }
  }
}

