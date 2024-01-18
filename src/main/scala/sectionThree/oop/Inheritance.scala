package sectionThree.oop

object Inheritance extends App {
  class Animal {
    val creatureType = "wild"
    protected def eat: Unit = println("yummy!")
  }

  /*
    Scala is a single class inheritance
    Cat is subclass and Animal is superclass
  */
  class Cat extends Animal {
    def crunch(): Unit = {
      eat
      println("Hello crunch!")
    }
  }

  val cat = new Cat
  cat.crunch ()

  /* Extending class with parameters */
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  /* Overriding */
  class Dog(override val creatureType: String) extends Animal {
    /* Can also override it in the constructor */
//    override val creatureType = "domestic"
    override def eat: Unit = println("eating in dog class")
  }
  val dog = new Dog("domestic ")
  dog.eat
  println(dog.creatureType)

  /* Super keyword (used to call a method from parent class) */
  println("I'm calling from duck ...")
  class Duck extends Animal {
    super.eat
  }
  // Super called after creating an object
  val duck = new Duck

  /*
    Preventing overrides, How?
    1- Use final keyword with members/methods (no override) -> final def ...
    2- Use final keyword with class itself (no inheritance) -> final class Class ...
    3- User sealed keyword -> Seal classes
      - available extends in THIS FILE ONLY, not others
  */
}
