package sectionFour.fp

object AnonymousFunctions extends App {
  /* Anonymous or LAMBDA */
  val doubler: Int => Int = x => x * 2
  println(doubler(2))

  /* Multiple parameters */
  val adder: (Int, Int) => Int = (a, b) => a + b
  println(adder(2, 3))

  /* No params? must call them with parentheses */
  val nothingHere:() => String = () => "Test"
  println(nothingHere())

  /* Curly braces (common style) */
  val stringToInt = { (str: String) =>
    str.toInt
  }
  println(stringToInt("4").getClass)

  /* MORE syntactic sugar */
  val incremental: Int => Int = _ + 1 // same as x => x + 1 (shorter)
  val adderV2: (Int, Int) => Int = _ + _ // same as (a, b) => a + b

  /* Exercises */
  val specialAdd = (x: Int) => (y: Int) => x + y
  println(specialAdd(3)(4))
}
