package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuAnimationOpen extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var effects: js.UndefOr[java.lang.String] = js.undefined
}

object MenuAnimationOpen {
  @scala.inline
  def apply(duration: scala.Int | scala.Double = null, effects: java.lang.String = null): MenuAnimationOpen = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects)
    __obj.asInstanceOf[MenuAnimationOpen]
  }
}

