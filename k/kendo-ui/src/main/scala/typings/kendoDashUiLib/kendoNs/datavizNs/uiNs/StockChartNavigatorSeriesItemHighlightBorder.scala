package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSeriesItemHighlightBorder extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object StockChartNavigatorSeriesItemHighlightBorder {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): StockChartNavigatorSeriesItemHighlightBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorSeriesItemHighlightBorder]
  }
}

