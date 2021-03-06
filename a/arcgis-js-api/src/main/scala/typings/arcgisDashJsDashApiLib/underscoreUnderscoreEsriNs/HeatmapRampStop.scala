package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapRampStop
  extends stdLib.Object {
  /**
    * The color of the pixel corresponding to the appropriate pixel `ratio`. This value is typically between `0` and `1`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var color: Color
  /**
    * The label of the color stop displayed in the legend. Typically only the first and last stops have labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var label: java.lang.String
  /**
    * A number between `0` and `1` describing the position of the label on the ramp. For example, in a ramp with three stops, the first stop would have an offset of `0`, the second `0.5`, and the third `1`. These offset values are equally spaced for any given number of labels in the ramp. The interval of each offset value is equal to 1 divided by the number of stops minus 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var offset: scala.Double
  /**
    * The ratio of a pixel's intensity value to the minPixelIntensity of the renderer. The ratio of each pixel is matched to the corresponding color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var ratio: scala.Double
}

object HeatmapRampStop {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    label: java.lang.String,
    offset: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    ratio: scala.Double
  ): HeatmapRampStop = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label, offset = offset, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), ratio = ratio)
  
    __obj.asInstanceOf[HeatmapRampStop]
  }
}

