
object Logger extends App {
  def log(message: String, level:String = "INFO"): String = {
    s"[$level]: $message"
  }
  println(log("Hello", "World"))
  println(log("Hello"))
}
