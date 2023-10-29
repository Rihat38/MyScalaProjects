package lectures.week1basics

object Functions extends App {
  def aPerson(name: String, surname: String): String = {
    s"Hello, $name $surname, nice to meet you in Scala!"
  }
  println(aPerson("John", "Smith"))

  def greetingPerson(name: String, surname: String): Unit = println(
    s"Hello, $name $surname, nice to meet you in Scala!"
  )

  def aParameterlessFunction(): Unit = println("Function with no parameters")
  aParameterlessFunction()
  //aParameterlessFunction - in Scala3 this is incorrect

  def aFunctionWithDefaultParameter(x: Int, y: String = "Default Parameter"): String = {
    s"x = $x and y = $y"
  }
  println(aFunctionWithDefaultParameter(1)) // input x = 1 and y = Default Parameter

  def callByValue(x: Long): Unit = {
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")
  }

  def callByName(x: => Long): Unit = {
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
