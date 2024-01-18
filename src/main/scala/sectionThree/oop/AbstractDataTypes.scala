package sectionThree.oop

object AbstractDataTypes extends App {
  /*
    If you kept some methods unimplemented, that called ABSTRACT
    You want subclasses to implement it ...
    Can not make an instance from it
    override keyword is not mandatory for abstract but if you added a value in abstract class
    you should use override keyword.
  */
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    def eat: Unit = println("Meiaooo")
  }

  val dog = new Dog
  dog.eat

  /*
    Traits:
      - Classes are limited to inherit from a single class,
      but you can inherit from more than one trait
      I think it's like interfaces..
  */
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlood

  class Crocodile extends Animal with Carnivore with ColdBlood {
    val creatureType: String = "croc"
    def eat: Unit = println("nomomomn")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val dogV2 = new Dog
  val croc = new Crocodile
  croc.eat(dogV2)

  /*
    - Traits vs Abstract classes
      1. Both have abstract and non-abstract members
      2. Traits don't have constructors parameters
      3. You can extend one class but use multiple traits
      4.Traits = behavior and Abstract = "thing"
        Carnivore means that what animal eats
        and Animal it's an animal!
  */
}
