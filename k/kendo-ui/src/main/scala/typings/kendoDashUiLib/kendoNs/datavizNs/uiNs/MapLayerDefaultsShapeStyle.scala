package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsShapeStyle extends js.Object {
  var fill: js.UndefOr[MapLayerDefaultsShapeStyleFill] = js.undefined
  var stroke: js.UndefOr[MapLayerDefaultsShapeStyleStroke] = js.undefined
}

object MapLayerDefaultsShapeStyle {
  @scala.inline
  def apply(fill: MapLayerDefaultsShapeStyleFill = null, stroke: MapLayerDefaultsShapeStyleStroke = null): MapLayerDefaultsShapeStyle = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[MapLayerDefaultsShapeStyle]
  }
}

