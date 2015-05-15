package ch.devbox.algorithme

import scala.annotation.tailrec

object Exercice21 {

  def fib(n: Int): Int = {
    @tailrec
    def f(i: Int, prev: Int, next: Int): Int =  i match {
      case 0 => prev
      case 1 => next
      case _ => f(i - 1, next, prev + next)

    }

    f(n, 0, 1)
  }

}
