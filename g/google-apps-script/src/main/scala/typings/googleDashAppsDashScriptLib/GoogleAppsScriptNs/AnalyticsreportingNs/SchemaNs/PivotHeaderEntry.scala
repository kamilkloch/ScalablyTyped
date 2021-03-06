package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotHeaderEntry extends js.Object {
  var dimensionNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var dimensionValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var metric: js.UndefOr[MetricHeaderEntry] = js.undefined
}

object PivotHeaderEntry {
  @scala.inline
  def apply(
    dimensionNames: js.Array[java.lang.String] = null,
    dimensionValues: js.Array[java.lang.String] = null,
    metric: MetricHeaderEntry = null
  ): PivotHeaderEntry = {
    val __obj = js.Dynamic.literal()
    if (dimensionNames != null) __obj.updateDynamic("dimensionNames")(dimensionNames)
    if (dimensionValues != null) __obj.updateDynamic("dimensionValues")(dimensionValues)
    if (metric != null) __obj.updateDynamic("metric")(metric)
    __obj.asInstanceOf[PivotHeaderEntry]
  }
}

