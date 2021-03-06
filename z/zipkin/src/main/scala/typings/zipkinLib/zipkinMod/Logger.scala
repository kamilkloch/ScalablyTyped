package typings
package zipkinLib.zipkinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Logger (or transport) is what the Recorder uses to send spans to Zipkin.
  * @see https://github.com/openzipkin/zipkin-js/#transports Official transport implementations
  */
trait Logger extends js.Object {
  def logSpan(span: zipkinLib.zipkinMod.modelNs.Span): scala.Unit
}

object Logger {
  @scala.inline
  def apply(logSpan: zipkinLib.zipkinMod.modelNs.Span => scala.Unit): Logger = {
    val __obj = js.Dynamic.literal(logSpan = js.Any.fromFunction1(logSpan))
  
    __obj.asInstanceOf[Logger]
  }
}

