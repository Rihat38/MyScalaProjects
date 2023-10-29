import lectures.week1basics.Functions._

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Spec extends AnyFlatSpec with Matchers {
  "aPerson" should "return name and surname in correct format" in {
    aPerson(
      "Tagir",
      "Khaybullin"
    ) shouldEqual "Hello, Tagir Khaybullin, nice to meet you in Scala!"
  }
}
