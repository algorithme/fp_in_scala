package ch.devbox.algorithme

import org.scalatest._

class Exercice24Spec extends FunSpec with Matchers {

  describe("Exercice24") {
    import Exercice24._

    val curriedFunction = (a: String) => (b: String) => a + b

    describe("uncurry a function") {
      it("should decompose the function ") {
        assert(uncurry(curriedFunction)("a", "b") == "ab")
      }

    }
  }
}
