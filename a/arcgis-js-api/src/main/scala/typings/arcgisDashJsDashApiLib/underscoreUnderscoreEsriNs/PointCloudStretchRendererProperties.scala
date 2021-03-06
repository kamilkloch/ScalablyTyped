package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudStretchRendererProperties extends PointCloudRendererProperties {
  /**
    * The name of the number field whose values are used to drive the continuous color visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#field)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A transform that is applied to the field value before evaluating the renderer.  **Possible Values:** none | low-four-bit | high-four-bit | absolute-value | modulo-ten
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#fieldTransformType)
    *
    * @default null
    */
  var fieldTransformType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[PointCloudStretchRendererLegendOptions] = js.undefined
  /**
    * An array of color value pairs. Points with values between the specified stops are colorized with linearly interpolated colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#stops)
    */
  var stops: js.UndefOr[js.Array[PointCloudStretchRendererStops]] = js.undefined
}

object PointCloudStretchRendererProperties {
  @scala.inline
  def apply(
    colorModulation: PointCloudRendererColorModulation = null,
    field: java.lang.String = null,
    fieldTransformType: java.lang.String = null,
    legendOptions: PointCloudStretchRendererLegendOptions = null,
    pointSizeAlgorithm: PointCloudRendererPointSizeAlgorithm = null,
    pointsPerInch: scala.Int | scala.Double = null,
    stops: js.Array[PointCloudStretchRendererStops] = null
  ): PointCloudStretchRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (colorModulation != null) __obj.updateDynamic("colorModulation")(colorModulation)
    if (field != null) __obj.updateDynamic("field")(field)
    if (fieldTransformType != null) __obj.updateDynamic("fieldTransformType")(fieldTransformType)
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (pointSizeAlgorithm != null) __obj.updateDynamic("pointSizeAlgorithm")(pointSizeAlgorithm)
    if (pointsPerInch != null) __obj.updateDynamic("pointsPerInch")(pointsPerInch.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops)
    __obj.asInstanceOf[PointCloudStretchRendererProperties]
  }
}

