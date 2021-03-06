package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsStoreEvent extends js.Object {
  var preventDefault: js.Function
  var sender: OptionsStore
  def isDefaultPrevented(): scala.Boolean
}

object OptionsStoreEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => scala.Boolean, preventDefault: js.Function, sender: OptionsStore): OptionsStoreEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[OptionsStoreEvent]
  }
}

