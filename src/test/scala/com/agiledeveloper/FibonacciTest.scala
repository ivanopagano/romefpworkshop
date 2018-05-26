package com.agiledeveloper

import org.scalatest._

class FibonacciTest extends WordSpec with Matchers {

  "Fibonacci" should {
    "compute numbers in the series at a given position" in {
      Fibonacci.numberAtPosition(0) shouldBe 1
      Fibonacci.numberAtPosition(1) shouldBe 1
      Fibonacci.numberAtPosition(2) shouldBe 2
      Fibonacci.numberAtPosition(3) shouldBe 3
      Fibonacci.numberAtPosition(4) shouldBe 5
      Fibonacci.numberAtPosition(5) shouldBe 8
      Fibonacci.numberAtPosition(10) shouldBe 89
    }

    "collect the series up to a given position" in {
      Fibonacci.seriesUntilPosition(0) shouldBe List(1)
      Fibonacci.seriesUntilPosition(1) shouldBe List(1, 1)
      Fibonacci.seriesUntilPosition(2) shouldBe List(1, 1, 2)
      Fibonacci.seriesUntilPosition(3) shouldBe List(1, 1, 2, 3)
      Fibonacci.seriesUntilPosition(4) shouldBe List(1, 1, 2, 3, 5)
      Fibonacci.seriesUntilPosition(5) shouldBe List(1, 1, 2, 3, 5, 8)
      Fibonacci.seriesUntilPosition(10) shouldBe List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89)
    }
  }
}

