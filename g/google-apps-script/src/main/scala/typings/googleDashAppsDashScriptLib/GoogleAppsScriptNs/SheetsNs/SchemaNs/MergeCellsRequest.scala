package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeCellsRequest extends js.Object {
  var mergeType: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
}

object MergeCellsRequest {
  @scala.inline
  def apply(mergeType: java.lang.String = null, range: GridRange = null): MergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    if (mergeType != null) __obj.updateDynamic("mergeType")(mergeType)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[MergeCellsRequest]
  }
}

