package lectures.week2oop

object Generics {
  def countSumOfInt(nums: List[Int]): Int = nums.sum
  countSumOfInt(List(1, 2, 3)) //--> 6
  /*
  That's a bad implementation, because if we will want to expand
  our method for double, float or something else, we will have to
  duplicate code for another type. Instead of this we can use a
  generics
  -------------------
  countSumOfInt(List(1.3, 2.2, 3.1)) --> ERROR
   */

  def countSum[A: Numeric](nums: List[A]): A = nums.sum

  println(countSum[Int](List(1, 2, 3))) //--> 6
  println(countSum[Double](List(1.3, 2.2, 3.5))) //--> 7.0

  def createElement[A](el: A): A = {
    el
  }

  val anInt: Int = createElement(2)
  val aString: String = createElement("some string")
  println(s"anInt = $anInt, aString = $aString") //--> anInt = 2, aString = some string


  case class Vehicle(name: String)

  val aVehicle: Vehicle = createElement(Vehicle("car"))

  println(s"aVehicle = $aVehicle, Vehicle.name = ${aVehicle.name}") //--> aVehicle = Vehicle(car), Vehicle.name = car
}
