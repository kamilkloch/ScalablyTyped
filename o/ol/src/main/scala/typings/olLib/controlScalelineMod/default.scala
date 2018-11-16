package typings
package olLib.controlScalelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @classdesc
     * A control displaying rough y-axis distances, calculated for the center of the
     * viewport. For conformal projections (e.g. EPSG:3857, the default view
     * projection in OpenLayers), the scale is valid for all directions.
     * No scale line will be shown when the y-axis distance of a pixel at the
     * viewport center cannot be calculated in the view projection.
     * By default the scale line will show in the bottom left portion of the map,
     * but this can be changed by using the css selector `.ol-scale-line`.
     *
     * @param opt_options Scale line options.
     * @api stable
     */
@JSImport("ol/control/scaleline", JSImport.Default)
@js.native
class default ()
  extends openlayersLib.openlayersMod.controlNs.ScaleLine {
  /**
           * @classdesc
           * A control displaying rough y-axis distances, calculated for the center of the
           * viewport. For conformal projections (e.g. EPSG:3857, the default view
           * projection in OpenLayers), the scale is valid for all directions.
           * No scale line will be shown when the y-axis distance of a pixel at the
           * viewport center cannot be calculated in the view projection.
           * By default the scale line will show in the bottom left portion of the map,
           * but this can be changed by using the css selector `.ol-scale-line`.
           *
           * @param opt_options Scale line options.
           * @api stable
           */
  def this(opt_options: openlayersLib.openlayersMod.olxNs.controlNs.ScaleLineOptions) = this()
}

/**
     * @classdesc
     * A control displaying rough y-axis distances, calculated for the center of the
     * viewport. For conformal projections (e.g. EPSG:3857, the default view
     * projection in OpenLayers), the scale is valid for all directions.
     * No scale line will be shown when the y-axis distance of a pixel at the
     * viewport center cannot be calculated in the view projection.
     * By default the scale line will show in the bottom left portion of the map,
     * but this can be changed by using the css selector `.ol-scale-line`.
     *
     * @param opt_options Scale line options.
     * @api stable
     */
@JSImport("ol/control/scaleline", JSImport.Default)
@js.native
object default extends js.Object {
  /**
           * Update the scale line element.
           * @param mapEvent Map event.
           * @api
           */
  def render(mapEvent: openlayersLib.openlayersMod.MapEvent): scala.Unit = js.native
}
