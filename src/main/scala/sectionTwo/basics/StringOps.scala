package sectionTwo.basics

object StringOps extends App {
  val str: String = "I'm Mohamed Magdy and you ?"

  /* I'm gonna do some string operations here */
  println(str.charAt(2))
  println(str.substring(0, 12)) // (inclusive, exclusive)
  println(str.split(" ").toList) // returns an array
  println(str.startsWith("I'm")) // act as boolean (true or false)
  println(str.replace(" ", " *  ")) // returns a new string with the replaced one
  println(str.toUpperCase()) // opposite is toLowerCase()
  println(str.length)

  /* Convert string number to int ? Huh ez */
  val aString = "101"
  val toNumber = aString.toInt
  println(toNumber.getClass) // getClass returns the data type of the value/variable

  /* Here are some scala features */
  val name = "Mohamed"
  val age = 22
  /*
    If I want to make some expression in the value inside interpolator
    Just do it inside a { } like this -> ${age + 10}
  */
  /* s-Interpolator */
  val greeting = s"Hi, My name is $name and I'm $age years old!"
  println(greeting) // I did it before him xDD (Just searching)

  /* f-Interpolator */
  val height = 1.9d
  val person = "MeGzz"
  println(f"$person%s is $height%2.3f meters tall") // same as printf in C++

  /* raw-Interpolator */
  println(raw"I'm gonna use \n here") // will not affect
  val letsEscapeIt = "I'm gonna use \n here"
  println(raw"$letsEscapeIt") // Yes, it works
}
