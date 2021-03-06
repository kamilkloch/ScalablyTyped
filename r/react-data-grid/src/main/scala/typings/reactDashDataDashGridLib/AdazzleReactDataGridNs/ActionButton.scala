package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButton extends js.Object {
  var icon: java.lang.String
  def callback(): scala.Unit
}

object ActionButton {
  @scala.inline
  def apply(callback: () => scala.Unit, icon: java.lang.String): ActionButton = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), icon = icon)
  
    __obj.asInstanceOf[ActionButton]
  }
}

