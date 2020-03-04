package chapter2.chap

object Polymorphic {

  def main(args: Array[String]): Unit = {

  }

  def findFirstMono(ss: Array[String], key: String): Int ={
    @scala.annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)
    }
    loop(0)
  }

  def findFirstPoly[A](as: Array[A], p: A=> Boolean): Int = {
    @scala.annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n + 1)
    }
    loop(0)
  }



}
