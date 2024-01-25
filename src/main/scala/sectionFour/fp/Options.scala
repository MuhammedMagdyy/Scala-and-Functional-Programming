package sectionFour.fp

object Options extends App {
  /* Option is a wrapper for a value that might be present or not*/
  val myOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None
  println(myOption)

  /* Unsafe APIs */
  def unsafeMethod(): String = null

  //  val result = Some(unsafeMethod()) // wrong.. (some should have a value)
  val result = Option(unsafeMethod()) // some or none
  println(result)

  /* Chained methods */
  def backupMethod(): String = "A valid string"

  val chainedResult = Option(unsafeMethod())
    .orElse(Option(backupMethod()))

  /* Design unsafe APIs */
  def betterUnsafeMethod(): Option[String] = None

  def betterBackupMethod(): Option[String] = Some("A valid string")

  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod() // more readable

  /* Some functions */
  println(myOption.isEmpty)
  println(myOption.get) // unsafe - Don't use this
  println(myOption.map(_ * 2))
  println(myOption.filter(x => x > 10))
  println(myOption.flatMap(x => Option(x * 10)))
}
