package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBordersRequest extends js.Object {
  var bottom: js.UndefOr[Border] = js.undefined
  var innerHorizontal: js.UndefOr[Border] = js.undefined
  var innerVertical: js.UndefOr[Border] = js.undefined
  var left: js.UndefOr[Border] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
  var right: js.UndefOr[Border] = js.undefined
  var top: js.UndefOr[Border] = js.undefined
}

object UpdateBordersRequest {
  @scala.inline
  def apply(
    bottom: Border = null,
    innerHorizontal: Border = null,
    innerVertical: Border = null,
    left: Border = null,
    range: GridRange = null,
    right: Border = null,
    top: Border = null
  ): UpdateBordersRequest = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (innerHorizontal != null) __obj.updateDynamic("innerHorizontal")(innerHorizontal)
    if (innerVertical != null) __obj.updateDynamic("innerVertical")(innerVertical)
    if (left != null) __obj.updateDynamic("left")(left)
    if (range != null) __obj.updateDynamic("range")(range)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[UpdateBordersRequest]
  }
}

