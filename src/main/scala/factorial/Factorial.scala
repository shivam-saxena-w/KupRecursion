package factorial

object Factorial extends App {
  def factorial(num: Int): Int =
    if (num <= 1) num
    else num * factorial(num - 1)
}
