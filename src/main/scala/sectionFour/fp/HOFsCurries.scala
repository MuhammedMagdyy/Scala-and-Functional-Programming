package sectionFour.fp

object HOFsCurries extends App {
  /* Higher order function (HOF) */
  val superFunction: (Int, (String, (Int => Boolean))) => (Int => Int) = null
  /* such as: map, flatMap and filter */

  /*
    - Let's try something new..
    function that applies function n times over a value of x
    nTimes(f, n, x) =>
    nTimes(f, 3, x) = f(f(f(x))) = nTimes(f, 2, x) = f(f(f(x)))
    nTimes(f, n, x) = f(f(...(x))) = nTimes(f, n - 1, f(x))
  */
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n - 1, f(x))

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne, 10, 1))

  /* Curried Functions */
  val superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y
  val add3 = superAdder(3) // y => 3 + y
  println(add3(10))
  println(superAdder(3)(10))

  /* Functions with multiple parameter lists */
  def curriedFormatter(c: String)(x: Double): String = c.format(x)
  val standardFormat: (Double => String) = curriedFormatter("%4.2f")
  val perciseFormat: (Double => String) = curriedFormatter("%10.8f")
  println(standardFormat(Math.PI))
  println(perciseFormat(Math.PI))
}
