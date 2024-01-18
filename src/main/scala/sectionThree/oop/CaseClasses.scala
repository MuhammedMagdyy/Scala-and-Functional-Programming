package sectionThree.oop

object CaseClasses extends App {
  /*
      provides [equals, toString, hashCode]
   */

  case class Person(name: String, age: Int)

  // 1. change parameters to fields
  val mego = new Person("Mego", 22)
  println(mego.name) // valid

  // 2. sensible toString -> println(instance) equals to (instance.toString)
  println(mego.toString) // without "case" -> sectionThree.oop.CaseClasses$Person@3f3afe78

  // 3. equals and hashCode are implemented out of the box, How?
  val megoPowerTwo = new Person("Mego", 22)
  println(mego == megoPowerTwo) // true, cus of case keyword

  // 4. CCs have copy method, Huh?
  val megzz = mego.copy(age = 23) // valid
  println(megzz.age)

  // 5. CCs have a companion method (apply), we use this form as it is
  val elPersonMegzz = Person
  val elmegzz = Person("ElMegzz", 25)
  println(elmegzz)

  // 6. CCs are serializable (Akka framework)

  // 7. CCs have extractor pattern = Pattern Matching (section 5)
  case object EG {
    def name: String = "EG is EG"
  }
}
