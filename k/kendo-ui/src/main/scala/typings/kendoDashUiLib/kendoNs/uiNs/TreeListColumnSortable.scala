package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnSortable extends js.Object {
  var compare: js.UndefOr[js.Function] = js.undefined
}

object TreeListColumnSortable {
  @scala.inline
  def apply(compare: js.Function = null): TreeListColumnSortable = {
    val __obj = js.Dynamic.literal()
    if (compare != null) __obj.updateDynamic("compare")(compare)
    __obj.asInstanceOf[TreeListColumnSortable]
  }
}

