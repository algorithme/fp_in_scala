package ch.devbox.algorithme

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class Exercice21Spec extends FunSpec with Matchers {

  describe("Exercice21") {

    val expected = List[(Int, Int)](
      (0, 0),
      (1, 1),
      (2, 1),
      (3, 2),
      (4, 3),
      (5, 5),
      (6, 8),
      (7, 13),
      (8, 21),
      (10, 55),
      (12, 144)
    )

    expected.foreach{ expect =>
      val (input, output) = expect

      describe(s"Fibonacci of $input") {
        it(s"should be equal to $output") {
          assert(Exercice21.fib(input) == output)
        }
      }
    }
  }
}
