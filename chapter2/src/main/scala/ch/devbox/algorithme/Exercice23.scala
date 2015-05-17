package ch.devbox.algorithme

import scala.annotation.tailrec

object Exercice23 {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    (a: A) => {
      (b: B) => f(a, b)
    }
  }
}
