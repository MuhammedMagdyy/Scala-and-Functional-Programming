package sectionTwo.basics

/*
  if I don't want to use extends App
  I can write (main) then ctrl+space that will make the same
  all of them make the file runnable.
*/

object ValuesVariablesTypes extends App {
  /*
    VALs are immutable -> like const or final
    VARs are mutable -> like let

    I can also don't infer the data type [Don't be like JavaScript xD]
  */

  val x: Int = 20
  println(x)

  val aString = "Hello, World!"
  println(aString)

  /* Some of data type in scala */
  val aBooleanL: Boolean = false
  val aChar: Char = 'x'
  val anInt: Int = 0
  val aShort: Short = 10000
  val aLong: Long = 1009090909L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  /* Example on vars */
  var name = "Mohamed Magdy"
  println(name)

  name = "Ahmed Mohamed"
  println(name)
}
