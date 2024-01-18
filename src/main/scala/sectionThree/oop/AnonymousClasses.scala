package sectionThree.oop

object AnonymousClasses extends App {
  abstract class Animal {
    def eat: Unit
  }

  /*
  - Anonymous class works with traits and abstract, non-abstract classes :)
    class AnonymousClasses$$anon$1 extends Animal {
      override def eat: Unit = println("Anonymous?")
    }

    val funnyAnimal: Animal = new AnonymousClasses$$anon$1
  */

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("Anonymous?")
  }

  // prove it ?
  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, My name is $name, How can I help?")
  }

  val mego: Person = new Person("Mego") {
    override def sayHi: Unit = println("Hi, I'm Mego")
  }

  mego.sayHi
}
