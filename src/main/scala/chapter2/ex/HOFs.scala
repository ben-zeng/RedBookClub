package chapter2.ex

import scala.annotation.tailrec

object HOFs {

  def isSorted[A](as: List[A], ordered: (A, A) => Boolean): Boolean = {
    @tailrec
    def loop(as: List[A]): Boolean = {
      as match {
        case Nil => true
        case x :: xs if ordered(x, xs.head) => loop(xs)
        case _ => false
      }
    }

    loop(as)
  }

  def curry[A, B, C](f: (A, B) => C): A => B => C =
//    (a: A) => (b: B) => f(a, b)
    a => b => f(a, b)

  def unCurry[A, B, C](f: A => B => C): (A, B) => C =
//    (a: A, b: B) => f(a)(b)
    (a, b) => f(a)(b)

  def compose[A, B, C](f: B => C, g: A => B): A => C =
//    (a: A) => f(g(a))
    a => f(g(a))
}
