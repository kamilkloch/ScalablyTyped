package typings
package hummusDashRecipeLib.hummusDashRecipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextBoxStyle extends js.Object {
  var dash: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var fill: js.UndefOr[java.lang.String | js.Array[scala.Double]] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[java.lang.String | js.Array[scala.Double]] = js.undefined
}

object TextBoxStyle {
  @scala.inline
  def apply(
    dash: js.Array[scala.Double] = null,
    fill: java.lang.String | js.Array[scala.Double] = null,
    lineWidth: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    stroke: java.lang.String | js.Array[scala.Double] = null
  ): TextBoxStyle = {
    val __obj = js.Dynamic.literal()
    if (dash != null) __obj.updateDynamic("dash")(dash)
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBoxStyle]
  }
}

