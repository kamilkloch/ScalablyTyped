package typings
package antdDashMobileDashRnLib.libInputDashItemInputDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait TextInputProps extends js.Object {
  var focused: js.UndefOr[scala.Boolean] = js.undefined
}

object TextInputProps {
  @scala.inline
  def apply(focused: js.UndefOr[scala.Boolean] = js.undefined): TextInputProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    __obj.asInstanceOf[TextInputProps]
  }
}

