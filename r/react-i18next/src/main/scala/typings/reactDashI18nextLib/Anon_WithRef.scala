package typings
package reactDashI18nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WithRef extends js.Object {
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_WithRef {
  @scala.inline
  def apply(withRef: js.UndefOr[scala.Boolean] = js.undefined): Anon_WithRef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[Anon_WithRef]
  }
}

