package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileLayerCapabilities
  extends stdLib.Object {
  var exportMap: VectorTileLayerCapabilitiesExportMap
  /**
    * Indicates options supported by the exportTiles operation. Will be `null` if the `supportsExportTiles` is `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var exportTiles: js.Any
  /**
    * Indicates operations that can be performed on the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var operations: VectorTileLayerCapabilitiesOperations
}

object VectorTileLayerCapabilities {
  @scala.inline
  def apply(
    constructor: js.Function,
    exportMap: VectorTileLayerCapabilitiesExportMap,
    exportTiles: js.Any,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    operations: VectorTileLayerCapabilitiesOperations,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): VectorTileLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor, exportMap = exportMap, exportTiles = exportTiles, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[VectorTileLayerCapabilities]
  }
}

