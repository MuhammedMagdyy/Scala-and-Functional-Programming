package sectionFour.fp

object WhatsAFunction extends App {
  /*
    DREAM: use functions as first class elements
    PROBLEM: OOP :)
  */

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }
  println(doubler(2))

  /*
    function types = Function[A, B] -> from 1 to 22
    Function2[A, B, R] can be (A, B) => R (we will use it more)
  */
  val stringToIntConverter = new Function1[String, Int] {
    override def apply(v1: String): Int = v1.toInt
  }
  println(stringToIntConverter("43") + 43)

  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }
  println(adder(10, 20))

  /* Exercises */
  def concatStrings: (String, String) => String = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + " " + v2
  }
  println(concatStrings("Mohamed", "Magdy"))

  // Higher-order function - takes function as parameter and returns function
  val superAdder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
    override def apply(v1: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(v2: Int): Int = v1 + v2
    }
  }
  println(superAdder(3)(4)) // curried function -> called with more one parameter list
}

trait MyFunction[A, B] {
  def apply(element: A): B
}
