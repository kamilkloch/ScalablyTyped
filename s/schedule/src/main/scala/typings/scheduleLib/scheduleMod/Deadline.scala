package typings
package scheduleLib.scheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deadline extends js.Object {
  var didTimeout: scala.Boolean
  def timeRemaining(): scala.Double
}

object Deadline {
  @scala.inline
  def apply(didTimeout: scala.Boolean, timeRemaining: () => scala.Double): Deadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout, timeRemaining = js.Any.fromFunction0(timeRemaining))
  
    __obj.asInstanceOf[Deadline]
  }
}

