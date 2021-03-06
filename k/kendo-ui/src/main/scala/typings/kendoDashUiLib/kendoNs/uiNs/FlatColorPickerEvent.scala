package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatColorPickerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: FlatColorPicker
  def isDefaultPrevented(): scala.Boolean
}

object FlatColorPickerEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => scala.Boolean, preventDefault: js.Function, sender: FlatColorPicker): FlatColorPickerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[FlatColorPickerEvent]
  }
}

