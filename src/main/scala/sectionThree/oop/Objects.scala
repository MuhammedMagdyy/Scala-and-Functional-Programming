package sectionThree.oop

object Objects extends App {
  /*
    SCALA doesn't have class-level functionality  (STATIC keyword)
     Objects is equivalent to static in Java
  */
  object Person { // type + its instance
    val N_EYES = 2
    def canFly: Boolean = false
    def apply(mother: Person, father: Person): Person = new Person("Mego")
  }

  println(Person.canFly)

  class Person(val name: String) { /* Instance-level functionality */ }

  /* Scala objects = SINGLETON instance */
  val megzz = Person // Person is the only instance without new keyword
  if (megzz.canFly) println("Yes") else println("No") // Expression

  val samia = new Person("Samia")
  val ayman = new Person("Ayman")
  val mego = Person(samia, ayman)
  println(mego.name)
  /*
    Scala Applications = Scala Objects
    To make it runnable
    def main(args: Array[String]): Unit -> public static void main(String[] args)
  */
}