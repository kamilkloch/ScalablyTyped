package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInkRippleProvider extends js.Object {
  def disableInkRipple(): scala.Unit
}

object IInkRippleProvider {
  @scala.inline
  def apply(disableInkRipple: () => scala.Unit): IInkRippleProvider = {
    val __obj = js.Dynamic.literal(disableInkRipple = js.Any.fromFunction0(disableInkRipple))
  
    __obj.asInstanceOf[IInkRippleProvider]
  }
}

