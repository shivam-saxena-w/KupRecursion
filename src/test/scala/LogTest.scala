import Logger.log
import org.scalatest.funsuite.AnyFunSuite

class  LogTest  extends AnyFunSuite {
  // Test cases
  test("Default functionality test without declaring level"){
    assert(log("test message") == "[INFO]:test message")
  }

  test("Default functionality test with level"){
    assert(log("Loops are discouraged", "WARN") == "[WARN]:Loops are discouraged")
  }
}
