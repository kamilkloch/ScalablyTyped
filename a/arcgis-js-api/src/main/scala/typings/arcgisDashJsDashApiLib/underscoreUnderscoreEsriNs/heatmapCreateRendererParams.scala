package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait heatmapCreateRendererParams
  extends stdLib.Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#createRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[java.lang.String | Basemap] = js.undefined
  /**
    * The [blurRadius](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#blurRadius) in pixels that determines the area of influence of each point. A higher blur radius indicates points have more influence on surrounding points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#createRenderer)
    *
    * @default 10
    */
  var blurRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether to fade the lower color stops to a transparent color to create a fuzzy boundary on the edge of the heatmap. A value of `false` makes a discrete boundary on the lower color stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#createRenderer)
    *
    * @default true
    */
  var fadeToTransparent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. The value of the `field` is used as a multiplier in the heatmap, making areas with high field values hotter than areas where the features have low field values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#createRenderer)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined heatmap scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#createRenderer)
    */
  var heatmapScheme: js.UndefOr[HeatmapScheme] = js.undefined
  /**
    * The point layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#createRenderer)
    */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer
  /**
    * The maximum [ratio](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio) used in the [HeatmapRenderer.colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops) of the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#createRenderer)
    *
    * @default 1
    */
  var maxRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum [ratio](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio) used in the [HeatmapRenderer.colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops) of the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#createRenderer)
    *
    * @default 0.01
    */
  var minRatio: js.UndefOr[scala.Double] = js.undefined
  /**
    * A statistics object generated from the [heatmapStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#createRenderer)
    */
  var statistics: js.UndefOr[HeatmapStatisticsResult] = js.undefined
  /**
    * The view instance in which the visualization will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: MapView
}

object heatmapCreateRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    layer: FeatureLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    view: MapView,
    basemap: java.lang.String | Basemap = null,
    blurRadius: scala.Int | scala.Double = null,
    fadeToTransparent: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String = null,
    heatmapScheme: HeatmapScheme = null,
    maxRatio: scala.Int | scala.Double = null,
    minRatio: scala.Int | scala.Double = null,
    statistics: HeatmapStatisticsResult = null
  ): heatmapCreateRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view)
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeToTransparent)) __obj.updateDynamic("fadeToTransparent")(fadeToTransparent)
    if (field != null) __obj.updateDynamic("field")(field)
    if (heatmapScheme != null) __obj.updateDynamic("heatmapScheme")(heatmapScheme)
    if (maxRatio != null) __obj.updateDynamic("maxRatio")(maxRatio.asInstanceOf[js.Any])
    if (minRatio != null) __obj.updateDynamic("minRatio")(minRatio.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    __obj.asInstanceOf[heatmapCreateRendererParams]
  }
}

