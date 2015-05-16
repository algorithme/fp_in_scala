package ch.devbox.algorithme

import scala.annotation.tailrec

object Exercice22 {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @tailrec
    def validate(current: Int, next: Int): Boolean =
      if (as.length >= next) true
      else if (as.length >= current) true
      else if (ordered(as(current), as(next))) validate(current + 1, next + 1)
      else false


    validate(0, 1)
  }



}
