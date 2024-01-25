package sectionFour.fp

object MapFlatMapFilterFor extends App {
  val list = List(1, 2, 3)
  println(list) // whole list
  println(list.head) // first element
  println(list.tail) // remaining elements except head

  /* map */
  println(list.map(_ + 1)) // each element will increase by 1
  println(list.map(_ + " is a number"))

  /* filter */
  println(list.filter(_ % 2 == 0)) // returns the elements that match the condition

  /* flatMap */
  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  /* Exercises */
  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')
  val colors = List("black", "white")
  /* output: List("a1", "a2", ...., "d4")" */
  val combinations = numbers.flatMap(n => chars.map(c => "" + c + n))
  println(combinations)

  /* foreach */
  list.foreach(println)

  for (x <- 1 to 5) print(x + " ") // syntax "for"

  /* for-comprehensions (much readable) */
  val forComprehensions = for {
    n <- numbers if n % 2 == 0 // filter call for numbers
    c <- chars
    color <- colors
  } yield "" + c + n + "-" + color
  println(forComprehensions)

  for {
    n <- numbers
  } print("" + n + " ")

  /* Syntax overload */
  val ans = list.map { x =>
    x * 2
  }
  println(ans)
}
