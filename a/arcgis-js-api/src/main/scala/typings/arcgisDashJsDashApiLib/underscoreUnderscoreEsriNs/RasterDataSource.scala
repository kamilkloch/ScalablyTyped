package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterDataSource
  extends stdLib.Object {
  /**
    * The name of the raster in the registered workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#RasterDataSource)
    */
  var dataSourceName: java.lang.String
  /**
    * This value is always `raster`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#RasterDataSource)
    */
  var `type`: java.lang.String
  /**
    * The workspace where the raster resides as defined in the ArcGIS Server Manager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#RasterDataSource)
    */
  var workspaceId: java.lang.String
}

object RasterDataSource {
  @scala.inline
  def apply(
    constructor: js.Function,
    dataSourceName: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    `type`: java.lang.String,
    workspaceId: java.lang.String
  ): RasterDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor, dataSourceName = dataSourceName, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), workspaceId = workspaceId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RasterDataSource]
  }
}

