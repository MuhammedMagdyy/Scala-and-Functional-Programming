package sectionFive.pm

object AllThePatterns extends App {
  // Constants
  val x: Any = "Scala"
  val constants = x match {
    case 1 => "a number"
    case "Scala" => "The true"
    case true => "True"
    case AllThePatterns => "A singleton obj"
    case _ => "Nothing here baby"
  }
  println(constants)
}
