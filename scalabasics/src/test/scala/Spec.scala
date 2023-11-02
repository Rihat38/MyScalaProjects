import lectures.week1basics._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Spec extends AnyFlatSpec with Matchers {
  "aPerson" should "return name and surname in correct format" in {
    Functions.aPerson(
      "Tagir",
      "Khaybullin"
    ) shouldEqual "Hello, Tagir Khaybullin, nice to meet you in Scala!"
  }

  "powerOfTwo" should "return two in power of n" in {

    val t1 = System.nanoTime
    Recursion.powerOfTwo(32) shouldEqual BigInt("4294967296")
    println((System.nanoTime - t1) / 1e9d)
  }

  "powerOf" should "return two in power of n" in {

    val t1 = System.nanoTime
    Recursion.powerOf(32) shouldEqual BigInt("4294967296")
    println((System.nanoTime - t1) / 1e9d)
  }

  "increase" should "displays the result as many times as there are numbers in it, and the phrase \"is the result\"" in {

    Recursion.increase(10, 1, 5) shouldEqual "15 15 is the result"
  }
}
