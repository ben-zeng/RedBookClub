package chapter2.chap

object MyModule {

  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(formatFactorial(7))
    println(formatResult("factorial", 7, factorial))
  }

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }

  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  def formatResult(name: String, n: Int, f: Int => Int): String ={
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }

  private def formatAbs(x: Int): String = {
    val msg = "The absolute value of %d is %d."
    msg.format(x, abs(x))
  }

  private def formatFactorial(n: Int): String = {
    val msg = "The factorial of %d is %d."
    msg.format(n, factorial(n))
  }

}
