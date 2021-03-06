package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Slider
  def isDefaultPrevented(): scala.Boolean
}

object SliderEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => scala.Boolean, preventDefault: js.Function, sender: Slider): SliderEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[SliderEvent]
  }
}

