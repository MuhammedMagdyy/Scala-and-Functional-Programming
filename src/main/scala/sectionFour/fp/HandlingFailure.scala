package sectionFour.fp

import scala.util.{Failure, Success, Try}

object HandlingFailure extends App {
  /* Create success and failure */
  val aSuccess = Success(3)
  val aFailure = Failure(new RuntimeException("SUPER FAILURE"))
  println(aSuccess)
  println(aFailure)

  def unsafeMethod(): String = throw new RuntimeException("NO STRING FOR YOU")

  val potentialFailure = Try(unsafeMethod()) // Don't need to make failure with my hand like above
  println(potentialFailure)

  val anotherPotentialFailure = Try {
    // something throws error
  }

  println(potentialFailure.isSuccess) // utils

  def backupMethod(): String = "A valid result"
  val fallBackTry = Try(unsafeMethod()).orElse(Try(backupMethod()))
  println(fallBackTry)

  // Design APIs
  def betterUnsafeMethod(): Try[String] = Failure(new RuntimeException)
  def betterBackupMethod(): Try[String] = Success("A valid result")
  val betterFallback = betterUnsafeMethod() orElse betterBackupMethod()
  println(betterFallback)

  // Map, flatMap and filter
  println(aSuccess.map(_ * 2))
  println(aSuccess.flatMap(x => Success(x * 10)))
  println(aSuccess.filter(_ > 10))
}
