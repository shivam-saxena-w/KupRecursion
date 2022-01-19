import factorial.Factorial.recursiveFactorial
import factorial.FactTailRec.tailRecursiveFactorial
import org.scalatest.funsuite.AnyFunSuite

class FactorialTest extends AnyFunSuite {
  /**************** Tests for recursiveFactorial ****************/
  test("factorial of 0"){
    val input = 0
    val output = 1
    assert(recursiveFactorial(input) == output)
  }

  test("factorial of positive integer"){
    val input = 5
    val output = 120
    assert(recursiveFactorial(input) == output)
  }

  test("factorial of negative integer"){
    val input = -5
    val output = -120
    assert(recursiveFactorial(input) == output)
  }
  /**************** Tests for tailRecursiveFactorial ****************/
  test("tail recursive factorial of 0"){
    val input = 0
    val output = 1
    assert(tailRecursiveFactorial(input) == output)
  }

  test("tail recursive factorial of positive integer"){
    val input = 5
    val output = 120
    assert(tailRecursiveFactorial(input) == output)
  }

  test("tail recursive factorial of negative integer"){
    val input = -5
    val output = -120
    assert(tailRecursiveFactorial(input) == output)
  }
}
