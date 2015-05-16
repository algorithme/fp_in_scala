package ch.devbox.algorithme

import org.scalatest._

class Exercice22Spec extends FunSpec with Matchers {

  describe("Exercice22") {
    import Exercice22._

    describe("isSorted should return TRUE for these Arrays") {

      it("should be true for an empty Array of Int") {
        assert(isSorted(Array(), (a: Int, b: Int) => a > b))
      }

      it("should be true for an ordered list of Int") {

        assert(isSorted(Array(1, 2, 3, 4, 5, 6, 7, 8), (a: Int, b: Int) => a > b))

        assert(isSorted(Array(1, 3, 4, 5, 7, 8), (a: Int, b: Int) => a > b))

        assert(isSorted(Array(1, 3, 4, 4, 5, 7, 8), (a: Int, b: Int) => a > b))
      }

      it("should be true for an empty Array of String") {
        assert(isSorted(Array(), (a: String, b: String) => a > b))
      }

      it("should be true for an ordered list of String") {

        assert(isSorted(Array("a", "b", "c"), (a: String, b: String) => a > b))

        assert(isSorted(Array("abracadabra", "dolphin", "zebra"), (a: String, b: String) => a > b))

        assert(isSorted(Array("abracadabra", "zebra"), (a: String, b: String) => a > b))
      }
    }

    describe("isSorted should return FALSE for these Arrays") {

      it("should be false for an unordered list of Int") {

        assert(isSorted(Array(1, 2, 3, 4, 5, 6, 7, 8, 0), (a: Int, b: Int) => a > b))

        assert(isSorted(Array(5, 1, 3, 4, 5, 7, 8), (a: Int, b: Int) => a > b))

        assert(isSorted(Array(1, 4,  3, 4, 4, 5, 7, 8), (a: Int, b: Int) => a > b))
      }


      it("should be false for an unordered list of String") {

        assert(isSorted(Array("a", "c", "b"), (a: String, b: String) => a > b))

        assert(isSorted(Array("zebra", "abracadabra", "dolphin"), (a: String, b: String) => a > b))

        assert(isSorted(Array( "zebra", "abracadabra"), (a: String, b: String) => a > b))
      }
    }
  }
}
