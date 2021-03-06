package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariCommandEvent extends SafariEvent {
  /**
  		* The command identifier of the target being dispatched.
  		*/
  var command: java.lang.String
}

object SafariCommandEvent {
  @scala.inline
  def apply(
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    command: java.lang.String,
    currentTarget: SafariEventTarget,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    preventDefault: () => scala.Unit,
    stopPropagation: () => scala.Unit,
    target: SafariEventTarget,
    timestamp: scala.Double,
    `type`: java.lang.String
  ): SafariCommandEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, command = command, currentTarget = currentTarget, defaultPrevented = defaultPrevented, eventPhase = eventPhase, preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SafariCommandEvent]
  }
}

