package ch.devbox.algorithme

import org.scalatest._

class Exercice23Spec extends FunSpec with Matchers {

  describe("Exercice23") {
    import Exercice23._

    describe("curry a function") {
      it("should decompose the function ") {
        assert(curry((a: String, b: String) => a + b)("a")("b") == "ab")
      }

    }
  }
}
