package lectures.week2oop

object ObjectsOOP {
  class MyString(val str: String) {
    private var extra = "extraData"

    /*
    Using override def toString we have an opportunity to configure a
    string representation of our class
    -------------------------
    def getString: String = str + extra
    println(MyString.apply("welcome").getString) --> welcomeextraData
    -------------------------
    override def toString: String = str + extra
    println(MyString("welcome")) --> welcomeextraData
    -------------------------
     */
    override def toString: String = str + extra
  }

  object MyString {
    def apply(base: String, extras: String): MyString = {
      val s = new MyString(base)
      s.extra = extras
      s
    }

    def apply(base: String) = new MyString(base)
  }

  class Number(val num: Int)

  object Number {
    val Pi = 3.14

    /*Using factory method we can add an additional functionality to class constructor.
    After that we can sum two Numbers using a construction like constructor.
    -------------------------
    val numA = new Number(1)
    val numB = new Number(2)
    val numC = Number(numA, numB)

    println(numC.num) --> 3
    -------------------------*/
    def apply(x: Number, y: Number): Number = new Number(x.num + y.num)
  }
}
