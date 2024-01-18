package sectionTwo.basics

/* I'm gonna use main at this time */

object Expressions {
  /* Unit is equals to void */
  def main(args: Array[String]): Unit = {
    /*
      There are several of expressions:
      - Arithmetic -> (+, -, /, *, %)
      - Logical -> (&&, ||, !)
      - Assignment -> (=, +=, -=, *=, /=, %=)
      - Bitwise -> (&, |, ~, ^, >>, <<, >>>)
      - Relational -> (==, !=, >, <, >=, <=)
    */

    val x = 1 + 2 * 5 // 11
    println(x)

    /*
      Notes:
        Instructions (DO) but Expressions (Value)
        In scala and FB we're gonna think in terms of expressions (every single line of code will compute a value)
        EVERYTHING in Scala is an EXPRESSION
        Side effects:
          println, whiles, reassigning

    */

    val aCondition = true
    val aConditionedValue = if(aCondition) 5 else 3 // IF Expression not IF Instruction
    println(aConditionedValue)

    if (true) {
      println("Yes")
    } else {
      println("No")
    }

    /* Code blocks are also expressions in scala */
    val anotherExpression = {
      val a = 10
      val b = a * 20

      if (b >= 30) "Yes" else "No"
    }
    println(anotherExpression)
  }
}
