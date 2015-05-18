package ch.devbox.algorithme

import org.scalatest._

class Exercice25Spec extends FunSpec with Matchers {

  describe("Exercice25") {
    import Exercice25._

    def convertStringToInt(a: String):Int = a.toInt

    def convertIntToFloat(a: Int): Float = a.toFloat + 0.10f

    describe("compose a function") {
      it("should compose a function that take a String, convert it to a Float and add 0.10") {
        assert(compose(convertIntToFloat, convertStringToInt)("10") == 10.10f)
      }

    }
  }
}
