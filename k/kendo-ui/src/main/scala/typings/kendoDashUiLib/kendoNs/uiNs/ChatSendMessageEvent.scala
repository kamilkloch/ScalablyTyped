package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatSendMessageEvent extends ChatEvent {
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ChatSendMessageEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Chat,
    text: java.lang.String = null
  ): ChatSendMessageEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ChatSendMessageEvent]
  }
}

