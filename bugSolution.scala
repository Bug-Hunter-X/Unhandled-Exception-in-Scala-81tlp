```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (y == 0) {
      throw new ArithmeticException("Division by zero")
    } else {
      x / y
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val obj = new MyClass(10)
    try {
      println(obj.myMethod(0)) 
    } catch {
      case e: ArithmeticException => println("Caught ArithmeticException: " + e.getMessage)
      case e: Exception => println("Caught another exception: " + e.getMessage) // Handles any other exception
    }
  }
}
```