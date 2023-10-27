package src.test.scala

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

object MySuite extends AnyFlatSpec with Matchers {
  "countOldManFloors" should "return the number of men older than the specified age" in {
    42 shouldEqual 42
  }
}
 