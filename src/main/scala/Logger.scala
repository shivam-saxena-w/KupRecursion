
object Logger extends App {
  def log(message: String="log called without a message", level:String = "INFO"): String = {
    s"[$level]:$message"
  }
}
