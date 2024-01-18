package sectionTwo.basics

object DefaultArgs extends App {
   def factorial(n: Int, acc: Int = 1): Int = {
     if (n < 1) acc
     else factorial(n - 1, n * acc)
   }

  /* This will overwrite the default value of accumulator  */
  val answer = factorial(5, 2)
  println(answer)

  /*
    If I have a function with more than one parameter I can send it by its name
    cus the compiler will confuse about it
   */
  def savePicture(format: String = "JPG", width: Int = 800, hight: Int = 600): Unit = {
    println("I'm saving it right now :)")
  }
  /* Like this */
  savePicture(width = 1920, hight = 1080)
}
