package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartYAxisItemTitle extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[ChartYAxisItemTitleBorder] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[ChartYAxisItemTitleMargin] = js.undefined
  var padding: js.UndefOr[ChartYAxisItemTitlePadding] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartYAxisItemTitle {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: ChartYAxisItemTitleBorder = null,
    color: java.lang.String = null,
    font: java.lang.String = null,
    margin: ChartYAxisItemTitleMargin = null,
    padding: ChartYAxisItemTitlePadding = null,
    position: java.lang.String = null,
    rotation: scala.Int | scala.Double = null,
    text: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    visual: js.Function = null
  ): ChartYAxisItemTitle = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (position != null) __obj.updateDynamic("position")(position)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    __obj.asInstanceOf[ChartYAxisItemTitle]
  }
}

