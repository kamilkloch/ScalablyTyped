package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarCollapseEvent extends PanelBarEvent {
  var item: js.UndefOr[stdLib.Element] = js.undefined
}

object PanelBarCollapseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: PanelBar,
    item: stdLib.Element = null
  ): PanelBarCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[PanelBarCollapseEvent]
  }
}

