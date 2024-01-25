package sectionFour.fp

object TuplesAndMaps extends App {
  /* Tuples -> finite ordered lists */
  val aTuple = (2, "Hello Scala") // Tuple2[Int, String] = (Int, String)
  println(aTuple._1) // 2 -> _1 first element
  println(aTuple.copy(_2 = "goodbye Java"))
  println(aTuple.swap)

  /* Maps - Keys -> Values */
  val aMap: Map[String, Int] = Map()
  val phoneBook = Map(("Megzz", 9090), "Mego" -> 8080).withDefaultValue(-1) // same
  println(phoneBook)

  /* Map operations */
  println(phoneBook.contains("Mego"))
  println(phoneBook("Megzz")) // apply method

  /* Add a pairing */
  val newPairing = "Magooza" -> 7070
  val newPhoneBook = phoneBook + newPairing
  println(newPhoneBook)

  /* Functions on Maps (map, flatMap, filter) */
  println(phoneBook.map(pair => pair._1.toLowerCase -> pair._2))
  println(phoneBook.view.filterKeys(x => x.startsWith("M")).toMap)
  println(phoneBook.view.mapValues(number => "+20" + number).toMap)

  /* Convert to other collections */
  println(phoneBook.toVector) // He made it toList
  println(List(("Megoz", 7878)).toMap)
  val names = List("Mohamed", "Magdy", "Helmy")
  println(names.groupBy(name => name.charAt(0))) // very useful
}
