package lectures.week1basics

import scala.annotation.tailrec

object Recursion  extends App {
  def factorialWithTailRecursion(n: Int): Int = {
    @tailrec
    def loop(x: Int, accumulator: Int = 1): Int = {
      if (x <= 1) accumulator
      else loop(x - 1, x * accumulator)
    }

    loop(n)
  }

  def repeatWord(word: String, n: Int): String = {
    @tailrec
    def loop(i: Int, acc: String = word): String = {
      if (i <= 1) acc
      else loop(i - 1, s"$word $acc")
    }

    loop(n)
  }

  def powerOfTwo(n: Int): BigInt = {
    @tailrec
    def go(cur: Int, acc: BigInt = 1): BigInt = {
      if (cur <= 0) acc
      else go(cur - 1,2 * acc)
    }

    go(n)
  }

  def powerOf(power: Int): BigInt = {
    @tailrec
    def rec(k: Int = power, b: BigInt = 2, acc: BigInt = 1): BigInt = {
      k match {
        case 0 => acc
        case even if even % 2 == 0 => rec(even / 2, b * b, acc)
        case odd => rec(odd - 1, b, b * acc)
      }
    }

    rec()
  }

  def increase(i: Int, inc: Int, count: Int): String = {
    @tailrec
    def go(n: Int = i, count: Int = count): Int = {
      count match {
        case 0 => n
        case _ => go(n + inc, count - 1)
      }
    }

    val result = go()

    @tailrec
    def strRes(counter: Int = i.toString.length, acc: String = ""): String = {
      if (counter == 0) acc
      else strRes(counter - 1, acc + result.toString + " ")
    }

    s"${strRes()}is the result"
  }
}
