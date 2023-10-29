package lectures.week1basics

object StringOperations {
  val aString: String = "Hello, world!"

  println(aString.length) // input 13
  println(aString.charAt(1)) // input e
  println(aString.substring(0, 5)) // input He
  println(aString.split(" ").toList) // input List(Hello,, world!)
  println(aString.startsWith("He")) // input true
  println(aString.replace("!", ".")) // input Hello, world.
  println(aString.toLowerCase) // input hello, world!
  println(aString.toUpperCase) // input HELLO, WORLD!
  println("abcd".reverse) // input dcba
  println("abcd".take(2)) // input ab

  val aNumber = "42".toInt
  println(aNumber.getClass) // input Int

  val aString42 = 42.toString
  println(aString42.getClass) // input String

  val name = "John"
  println(s"Hello, $name") // input Hello, John

  val surname = "Smith"
  println(s"Hello, ${name + surname}") // input Hello, JohnSmith

  val someString = "This is \n a string"
  print(someString) // input This is
                            //a string
  print(raw"This is \n a string") // input This is \n a string
  print(raw"$someString") // input This is
                                  //a string

}
