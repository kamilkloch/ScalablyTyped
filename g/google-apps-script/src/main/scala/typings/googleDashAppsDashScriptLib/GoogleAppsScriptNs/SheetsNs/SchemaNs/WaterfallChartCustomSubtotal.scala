package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartCustomSubtotal extends js.Object {
  var dataIsSubtotal: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var subtotalIndex: js.UndefOr[scala.Double] = js.undefined
}

object WaterfallChartCustomSubtotal {
  @scala.inline
  def apply(
    dataIsSubtotal: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    subtotalIndex: scala.Int | scala.Double = null
  ): WaterfallChartCustomSubtotal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataIsSubtotal)) __obj.updateDynamic("dataIsSubtotal")(dataIsSubtotal)
    if (label != null) __obj.updateDynamic("label")(label)
    if (subtotalIndex != null) __obj.updateDynamic("subtotalIndex")(subtotalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterfallChartCustomSubtotal]
  }
}

