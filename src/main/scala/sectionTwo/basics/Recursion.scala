package sectionTwo.basics

import scala.annotation.tailrec

object Recursion extends App {
  /* Will not work with big numbers */
  def factorial(n: Int): Int = {
    if (n < 1) 1
    else n * factorial(n - 1)
  }

  /*
    Works correctly, why?
      Allows scala to use the same frame of the stack memory not to use additional stack
      In the last factorial, Scala uses stack frame for each recursive call...
      If you're not sure that the function is not tail recursive, add @tailrec
      if not ok, the compiler will throw an error

    He said that if you want to use loops, go to tails..
  */

  def fact(n: Int): BigInt = {
    @tailrec
    def go(x: Int, accumulator: BigInt): BigInt = {
      if (x < 1) accumulator
      else go(x - 1, x * accumulator) // TAIL recursion
    }

    go(n, 1)
  }
  println(fact(20000))

  /* I'm gonna back to solve  exercises after knowing it at least 85% */
}
