package sectionThree.oop

import scala.language.postfixOps

object MethodNotations extends App {
  class Person(val name: String, favMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favMovie

    def +(person: Person): String = s"${this.name} is hanging out ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favMovie)

    def unary_! : String = s"$name, Are you busy?!"
    def unary_+ : Person = new Person(name, favMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, My name is $name and I like $favMovie"
    def apply(noTimes: Int): String = s"$name watched his/her fav movie $favMovie $noTimes time/s"

    def learns(langName: String): String = s"$name learns $langName"
    def learnsScala: String = learns("Scala") // He made it (this learns "scala")
  }

  val megzz = new Person("MeGzz", "movie")
  println(megzz.likes("movie")) // true

  val zezo = new Person("Zezo", "movie")
  println(megzz.+(zezo))

  /*
    Infix notation = operator notation (Syntactic Sugar)
    Works only with methods with one parameter
    Can be replaced with [object - method - parameter]
  */

  println(megzz likes "movie") // the magic happens, its equivalent to above one!
  println(megzz + zezo)

  /* All operators acts as method is Scala */
  println(1. +(2)) // ez :D

  /* Prefix Notation (+, -, ~, !) */
   val x = -1 // equivalent to (1.unary_-) also (~1)
  println(!megzz)
  println(megzz.unary_!) // both are equivalent

  /*
    Postfix Notation
    Only available to method with no parameters
  */
  println(megzz.isAlive)
  println(megzz isAlive)

  /* Special method name called apply() */
   println(megzz.apply())
  println(megzz()) // Same!! Cus of apply() method

  /* Exercises */

  println((megzz + "kun")())
  println((+megzz).age)
  println(megzz learnsScala)
  println(megzz(2))
}
