package sectionThree.oop

object OOBasics extends App {
   val person = new Person("Mohamed", 22)
   println(person.age)
   person.greet("MeGzz")
   person.greet()

   // Constructor
   class Person(name: String, val age: Int = 0) {
      /* Class body (Methods and Members) */

      /* this keyword refers to the field above */
      def greet(name: String): Unit = println(s"${this.name} says: Hello ya $name ya King!") // method
      def greet(): Unit = println(s"Hello ya $name ya King!") // overloading

      /* Multiple constructor (overloading constructors)  */
      def this() = this("Mohamed Magdy")
   }

   /*
     Class parameters are NOT fields
     If you want to make it member (field) just add (val) before it
     You can access it by (.) notation
   */

   /* Exercises */

   class Writer(firstName: String, surName: String, val year: Int) {
      def fullName(): String = this.firstName + " " + this.surName
   }

   class Novel(name: String, yor: Int, author: Writer) {
      def authorAge(): Int = {
         this.yor - author.year
      }

      def isWrittenBy(author: Writer): Boolean = {
         author == this.author
      }

      def copy(newYor: Int): Novel = {
         new Novel(name, newYor, author)
      }
   }

   class Counter(val cnt: Int) {
      def increment = new Counter(cnt + 1)

      def decrement = new Counter(cnt - 1)

      def increment(n: Int) = new Counter(cnt + n)

      def decrement(n: Int) = new Counter(cnt - n)
   }
}

