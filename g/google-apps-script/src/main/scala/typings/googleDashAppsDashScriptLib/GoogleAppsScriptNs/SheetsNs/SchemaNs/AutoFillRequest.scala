package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFillRequest extends js.Object {
  var range: js.UndefOr[GridRange] = js.undefined
  var sourceAndDestination: js.UndefOr[SourceAndDestination] = js.undefined
  var useAlternateSeries: js.UndefOr[scala.Boolean] = js.undefined
}

object AutoFillRequest {
  @scala.inline
  def apply(
    range: GridRange = null,
    sourceAndDestination: SourceAndDestination = null,
    useAlternateSeries: js.UndefOr[scala.Boolean] = js.undefined
  ): AutoFillRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range)
    if (sourceAndDestination != null) __obj.updateDynamic("sourceAndDestination")(sourceAndDestination)
    if (!js.isUndefined(useAlternateSeries)) __obj.updateDynamic("useAlternateSeries")(useAlternateSeries)
    __obj.asInstanceOf[AutoFillRequest]
  }
}

