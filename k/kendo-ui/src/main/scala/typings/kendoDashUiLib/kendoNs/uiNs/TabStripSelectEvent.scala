package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabStripSelectEvent extends TabStripEvent {
  var contentElement: js.UndefOr[stdLib.Element] = js.undefined
  var item: js.UndefOr[stdLib.Element] = js.undefined
}

object TabStripSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: TabStrip,
    contentElement: stdLib.Element = null,
    item: stdLib.Element = null
  ): TabStripSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (contentElement != null) __obj.updateDynamic("contentElement")(contentElement)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[TabStripSelectEvent]
  }
}

