package com.agiledeveloper

import org.scalatest._

class TripleTest extends WordSpec with Matchers {

  "The Triple function" should {
    "compute the correct triples" in {
      Triple.computeTriples(1) shouldBe List("3 4 5")
      Triple.computeTriples(2) shouldBe List("3 4 5", "8 6 10")
      Triple.computeTriples(3) shouldBe List("3 4 5", "8 6 10", "5 12 13")
      Triple.computeTriples(4) shouldBe List("3 4 5", "8 6 10", "5 12 13", "15 8 17")
      Triple.computeTriples(5) shouldBe List("3 4 5", "8 6 10", "5 12 13", "15 8 17", "12 16 20")
      Triple.computeTriples(10) should have size 10
      Triple.computeTriples(10) should contain ("21 20 29")
      Triple.computeTriples(20) should have size 20
      Triple.computeTriples(20) should contain("45 28 53")
    }
  }
}