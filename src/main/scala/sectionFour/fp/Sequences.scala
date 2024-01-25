package sectionFour.fp

import scala.util.Random

object Sequences extends App {
  /* Seq is actually a List */
  val aSequence = Seq(1, 3, 2, 4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2)) // apply will get index (2)
  println(aSequence ++ Seq(5, 7, 6)) // ++ -> concat two sequences
  println(aSequence.sorted) // sort the seq

  /*
    Ranges
    - to => from a to b (inclusive)
    - until from a to b - 1 (exclusive)
  */
  val aRange: Seq[Int] = 1 until 10
  aRange.foreach(println)

  /* He made it with foreach :) */
  (1 to 10).map(x => println("Hello word " + x))

  /*
    Lists
    - prepended (:: or +:) -> adds element in the first
    - appended (:+) -> adds element in the last
    - fill(n)(value) -> curried function fills list with the same value
    - mkString(value) -> concat string with any value
  */
  val aList = List(1, 2, 3)
  val prepended = 42 +: aList :+ 50 // will add 42 in first and 50 in last
  println(prepended)

  val apples5 = List.fill(5)("apple")
  println(apples5)
  println(aList.mkString(" | "))

  /*
    Arrays are mutated
    - primitive types -> default value (0) [Int, Double, ...]
    - reference types -> default value (null) [String, ...]
    - array(index) = value -> syntax sugar for array.update(index, value)
  */
  val numbers = Array(1, 2, 3, 4)
  val threeElements = Array.ofDim[Int](3) // creates an array with three elements
  println(threeElements.length) // 3
  threeElements.foreach(println) // 0
  numbers(1) = 5 // index 1 will be value 5
  println(numbers.mkString(" ")) //1 5 3 4

  /* Arrays and Sequences */
  val numberSeq: Seq[Int] = numbers // implicit conversion (advanced)
  println(numberSeq) // WrappedArray = ArraySeq

  /* Vectors */
  val vector: Vector[Int] = Vector(1, 2, 3)
  println(vector)

  /* Vector vs List */
  val MAX_RUNS = 1000
  val MAX_CAPACITY = 1000000
  def getWrtierTime(collection: Seq[Int]): Double = {
    val random = new Random
    val times = for {
      it <- 1 to MAX_RUNS
    } yield {
      val currentTime = System.nanoTime()
      collection.updated(random.nextInt(MAX_CAPACITY), 0)
      System.nanoTime() - currentTime
    }

    times.sum * 1.0 / MAX_RUNS
  }

  val numbersList = (1 to MAX_CAPACITY).toList
  val numbersVector  = (1 to MAX_CAPACITY).toVector

  // keeps reference to tail (adv)
  // updating mid element takes long time (dis)
  println(getWrtierTime(numbersList))
  // depth of the tree is small (adv)
  // needs to replace an entire 31-element chunk (dis)
  println(getWrtierTime(numbersVector))
}
