package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineValueAxisItemCrosshair extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var dashType: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var tooltip: js.UndefOr[SparklineValueAxisItemCrosshairTooltip] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SparklineValueAxisItemCrosshair {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    dashType: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    tooltip: SparklineValueAxisItemCrosshairTooltip = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): SparklineValueAxisItemCrosshair = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineValueAxisItemCrosshair]
  }
}

