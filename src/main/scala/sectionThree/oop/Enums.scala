package sectionThree.oop

object Enums {
  enum Permissions {
    case READ, WRITE, EXECUTE, NONE

    // Can add fields/methods
    def openDocument(): Unit = {
      if (this == READ) println("Opening...")
      else println("Not allowed to do this...")
    }
  }

  val read: Permissions = Permissions.READ

  // constructor args
  enum PermissionsWithBits(bits: Int) {
    case READ extends PermissionsWithBits(4) // 100
    case WRITE extends PermissionsWithBits(2) // 010
    case EXECUTE extends PermissionsWithBits(1) // 001
    case NONE extends PermissionsWithBits(0) // 000
  }

  object PermissionsWithBits {
    def fromBits(bits: Int): PermissionsWithBits =
      PermissionsWithBits.NONE
  }

  // standard API
  val somePermissionsOrdinal = read.ordinal
  println(somePermissionsOrdinal)

  val allPermissions = PermissionsWithBits.values // returns an array with all possible values
  val readPermission = Permissions.valueOf("READ")
  
  def main(args: Array[String]): Unit = {
    read.openDocument()
  }
}
