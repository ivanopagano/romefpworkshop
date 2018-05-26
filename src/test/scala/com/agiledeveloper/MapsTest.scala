package com.agiledeveloper

import org.scalatest._

class MapsTest extends WordSpec with Matchers {
  "The Maps functions" when {
    "given a scores map" should {
      val scores = Map(
        "Jack" -> 12,
        "Jill" -> 15,
        "Tom" -> 11,
        "Darla" -> 15,
        "TOM" -> 11,
        "Nick" -> 15,
        "Nancy" -> 11
      )

      "collect names by scores" in {
        Maps.listByScore(scores)(12) shouldBe List("Jack")
        Maps.listByScore(scores)(15) should have size 3
        Maps.listByScore(scores)(15) should contain ("Darla")
        Maps.listByScore(scores)(11) should have size 3
        Maps.listByScore(scores)(11) should contain ("Tom")
        Maps.listByScore(scores)(11) should contain ("TOM")
      }

      "collect names sets by score" in {
        Maps.setByScore(scores)(12) should contain ("JACK")
        Maps.setByScore(scores)(15) should have size 3
        Maps.setByScore(scores)(15) should contain ("DARLA")
        Maps.setByScore(scores)(11) should have size 2
        Maps.setByScore(scores)(11) should contain ("TOM")
      }

      "count scores" in {
        Maps.countScores(scores)(12) shouldBe 1
        Maps.countScores(scores)(11) shouldBe 3
        Maps.countScores(scores)(15) shouldBe 3
      }

      "count letters for each score" in {
        Maps.numberOfLetters(scores)(12) should contain (4)
        Maps.numberOfLetters(scores)(15) should contain (5)
        Maps.numberOfLetters(scores)(15) should contain (4)
        Maps.numberOfLetters(scores)(11) should contain (5)
        Maps.numberOfLetters(scores)(11) should contain (3)
      }

      "compute the longest name for each score" in {
        Maps.maxNumberOfLetters(scores)(12) shouldBe 4
        Maps.maxNumberOfLetters(scores)(15) shouldBe 5
        Maps.maxNumberOfLetters(scores)(11) shouldBe 5
      }
    }
  }
}
