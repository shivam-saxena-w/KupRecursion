package factorial

import scala.annotation.tailrec
import scala.jdk.Accumulator

object FactTailRec extends App {

  def tailRecursiveFactorial(integerInput: Int): Int =
    @tailrec
    def factorailHelper(integerInput: Int, accumulator: Int): Int =
      if (integerInput.abs <= 1) accumulator
      else factorailHelper(integerInput.abs - 1, accumulator * integerInput)

    factorailHelper(integerInput, 1)

  println(tailRecursiveFactorial(-5))
}

