package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewTransitionEndEvent extends ViewEvent {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ViewTransitionEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: View,
    `type`: java.lang.String = null
  ): ViewTransitionEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ViewTransitionEndEvent]
  }
}

