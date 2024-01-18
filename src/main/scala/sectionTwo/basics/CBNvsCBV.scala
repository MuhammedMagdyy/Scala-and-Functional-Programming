package sectionTwo.basics

object CBNvsCBV {
  def main(args: Array[String]): Unit = {
    def calledByValue(x: Long): Unit = {
      println(s"call by value ${x}")
      println(s"call by value ${x}")
    }

    /*
      Notes:
        => tells the compiler that the parameter will be called by its name
        in nanoTime, every time he must evaluate it that's why gets another values
    */
    def calledByName(x: => Long): Unit = {
      println(s"call by name ${x}")
      println(s"call by name ${x}")
    }

    calledByValue(System.nanoTime())
    calledByName(System.nanoTime())
  }
}
