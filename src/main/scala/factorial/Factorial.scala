package factorial

object Factorial extends App {
  def recursiveFactorial(integerInput: Int): Int =
    if(integerInput == 0) 1
    else if (integerInput < 0) ((integerInput * recursiveFactorial(integerInput.abs - 1))).toInt
    else
      if (integerInput <= 1) integerInput
      else integerInput * recursiveFactorial(integerInput - 1)
}