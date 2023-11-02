val str = "I like     Scala"
str.split(" ").filter(_ != "").reverse.mkString(" ")

val str1 = "QWERTYUIOP"
str1.toLowerCase