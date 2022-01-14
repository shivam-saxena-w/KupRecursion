import com.sun.xml.internal.ws.api.message.Message

object Logger extends App {
  def log(message: String, level:String = "INFO"): String = {
    s"[$level]: $message"
  }
}
