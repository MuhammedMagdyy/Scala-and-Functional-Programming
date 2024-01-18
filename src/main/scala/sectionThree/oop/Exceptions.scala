package sectionThree.oop

object Exceptions extends App {
  val x: String = null

  // 1. throwing exceptions
  // throw new NullPointerException

  /*
    throwable classes extend the throwable class
    Exception and Error are the major throwable subtypes
  */

  // 2. How to catch exceptions [try, catch, finally]
  def getInt(withException: Boolean): Int = {
    if (withException) throw new RuntimeException("Not int here")
    else 42
  }

  try {
    // Code that might throw
    getInt(true)
  } catch {
    case e: RuntimeException => println("Caught!!")
  } finally {
    // Code will execute whatever happens
    println("I'm in finally!")
  }

  /* That's all for now :) */
}
