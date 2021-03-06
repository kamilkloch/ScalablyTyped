package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightReportCompatibleFields extends js.Object {
  var dimensionFilters: js.UndefOr[js.Array[Dimension]] = js.undefined
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
}

object FloodlightReportCompatibleFields {
  @scala.inline
  def apply(
    dimensionFilters: js.Array[Dimension] = null,
    dimensions: js.Array[Dimension] = null,
    kind: java.lang.String = null,
    metrics: js.Array[Metric] = null
  ): FloodlightReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    __obj.asInstanceOf[FloodlightReportCompatibleFields]
  }
}

