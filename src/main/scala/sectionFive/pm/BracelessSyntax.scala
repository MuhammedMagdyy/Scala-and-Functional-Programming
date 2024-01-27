package sectionFive.pm

object BracelessSyntax {
  // if expression
  val anIfExpression = if (2 > 3) "bigger" else "smaller"

  // Java-Style
  val anIfExpressions_v2 =
    if (2 > 3) {
      "bigger"
    } else {
      "smaller"
    }

  // Compact
  val anIfExpression_v3 =
    if (2 > 3) "bigger"
    else "smaller"

  // Scala 3
  val anIfExpression_v4 =
    if 2 > 3 then
      "bigger" // higher indentation than the if part
    else
      "smaller"

  val anIfExpression_v5 =
    if 2 > 3 then
      val result = "bigger"
      result
    else
      val result = "smaller"
      result

  // one line? ez
  val anIfExpression_v6 = if 2 > 3 then "bigger" else "smaller"

  // for comprehensions
  val aForComprehension = for {
    n <- List(1, 2, 3)
    s <- List("Black", "White")
  } yield s"$n$s"

  // Scala 3
  val anForComprehension_v2 =
    for
      n <- List(1, 2, 3)
      s <- List("Black", "White")
    yield s"$n$s"

  // Pattern Matching
  val meaningOfLife = 42
  val aPatternMatch = meaningOfLife match {
    case 1 => "One"
    case 2 => "Two"
    case _ => "Hahaha Nothing here klonia"
  }

  // Scala 3
  val aPatternMatch_v2 =
    meaningOfLife match
      case 1 => "One"
      case 2 => "Two"
      case _ => "Nothing Here"


  // Methods without braces :)
  def ezBezy(arg: Int): Int =
    val sheeesh = 10
    sheeesh + 2

  // Classes without braces
  class Animal:
    def eat(): Unit =
      println("Eating")
    end eat

    def grow(): Unit =
      println("Growing")

    // if you have more than 3000 lines use end
  end Animal // for if, match, methods, traits, etc...


  // Anonymous Classes
  val specialAnimal = new Animal:
    override def eat(): Unit = println("Special")

  def main(args: Array[String]): Unit = {
    println(anIfExpression_v5)
  }
}
