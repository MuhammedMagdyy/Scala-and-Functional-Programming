package sectionTwo.basics

object Functions extends App {
  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("Hi, Mego", 2))

  /* In some cases scala is smart to know what is the return type (My eftkasa after testing it xD) */
  def parameterlessFunction() = 42 // Int
  println(parameterlessFunction())

  /*
    Instead of loops, we're using recursion in scala
    WHEN YOU NEED TO USE LOOPS, GO TO RECURSION (IMPORTANT)
  */
  def aRepeatedFunction(a: String, n: Int): String = {
    if (n == 1) a
    else a + aRepeatedFunction(a, n - 1)
  }
  println(aRepeatedFunction("Mohamed", 2))

  /* Exercises */
  def greetings(name: String, age: Int): Unit = {
    println(s"Hello, My name is ${name} and I'm ${age} years old!")
  }
  greetings("Mohamed", 22)

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }
  println(factorial(5))

  def fibonacci(n: Int): Int = {
    if (n == 0 || n == 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  println(fibonacci(8))

  /* I'm trying to understand this... */
  def isPrime(n: Int): Boolean = {
    def primes(p: Int): Boolean =
      if (p <= 1) true
      else n % p != 0 && primes(p - 1)

    primes(n / 2)
  }
  println(isPrime(5))
  println(isPrime(2))
  println(isPrime(15))
}
