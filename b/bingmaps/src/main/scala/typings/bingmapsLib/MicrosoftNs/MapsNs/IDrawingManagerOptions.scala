package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrawingManagerOptions extends IDrawingToolOptions {
  /** The fill color used for pushpins and polygons. */
  var fillColor: js.UndefOr[java.lang.String | Color] = js.undefined
  /** The stroke color used for polylines and polygons. */
  var strokeColor: js.UndefOr[java.lang.String | Color] = js.undefined
}

object IDrawingManagerOptions {
  @scala.inline
  def apply(
    drawingBarActions: bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingBarAction = null,
    fillColor: java.lang.String | Color = null,
    strokeColor: java.lang.String | Color = null
  ): IDrawingManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (drawingBarActions != null) __obj.updateDynamic("drawingBarActions")(drawingBarActions)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDrawingManagerOptions]
  }
}

