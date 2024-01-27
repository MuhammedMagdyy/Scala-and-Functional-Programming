package sectionFive.pm

object PatternsEverywhere extends App {
  /* Catches are pattern match! */
  try {
    // code
  } catch {
    case e: RuntimeException => "RTE"
    case npe: NullPointerException => "NPE"
    case _ => "ISE"
  }

  val list = List(1, 2, 3, 4)
  val evens = for {
    x <- list if x % 2 == 0
  } yield x * 29
  println(evens)

  val head :: tail = list
  println("head: " + head)
  println("tail: " + tail)
}
