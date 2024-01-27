package sectionFive.pm

import scala.util.Random

object PatternMatching extends App {
  val random = new Random
  val x = random.nextInt(10)

  // I think it's like switch case?
  val description = x match {
    case 1 => "the ONE"
    case 2 => "double or nothing"
    case 3 => "third time is the best"
    case _ => "something else" // _ = wildcard (nothing)
  }
  println(x)
  println(description)

  // 1. Decompose values
  case class Person(name: String, age: Int)

  val bob = Person("Bob", 17)

  val greeting = bob match {
    case Person(n, a) if a < 21 => s"$n and $a lol"
    case Person(n, a) => s"$n and $a"
    case _ => "Who are you?"
  }
  println(greeting)

  sealed class Animal

  case class Dog(breed: String) extends Animal

  case class Parrot(greeting: String) extends Animal

  val animal: Animal = Dog("SOSO")
  val someAnimal = animal match {
    case Dog(someBreed) => println(s"Matched $someBreed")
    case _ => "No matching here"
  }
  println(someAnimal)
}
