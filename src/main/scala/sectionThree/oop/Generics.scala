package sectionThree.oop

object Generics extends App {
  /* A -> generic type, it works with classes and traits */
  class MyList[A] {}

  /* Use more than one generic */
  class MyMap[Key, Value] {}

  /* Data type inside [] will replace A in the class */
  val listIntegers = new MyList[Int]
  val listStrings = new MyList[String]

  /* Generic methods */
  object MyList {
    /* ??? -> refers to return nothing */
    def empty[A]: MyList[A] = ???
  }

  val emptyListIntegers = MyList.empty[Int]

  /* Variance Problem */
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  /*
    If one cat extends animal class, so list of cats extends list of animals?
     - Yes, List[Cat] extends List[Animal] -> Covariance (+)
     - No -> Invariance ()
     - Big No -> Contravariance (-)
  */
  class CovariantList[+A]
  class InvariantList[A]
  class ContravariantList[-A]

  val animal: Animal = new Cat
  val covariantAnimal: CovariantList[Animal] = new CovariantList[Cat] // 1
  val invariantListAnimal: InvariantList[Animal] = new InvariantList[Animal] // 2
  val contravariantAnimal: ContravariantList[Cat] = new ContravariantList[Animal] // 3

  /* Bounded types (<: ) -> accepts only types from subclasses */
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
  // val car = new Cage(new Car) // throws an error cus car not subclass from animal

  /* I'm sure, I'm gonna back one day */
}
