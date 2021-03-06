package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCreateFromPolygonParams
  extends stdLib.Object {
  /**
    * The material to be used for the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromPolygon)
    */
  var material: js.UndefOr[MeshCreateFromPolygonParamsMaterial] = js.undefined
}

object MeshCreateFromPolygonParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    material: MeshCreateFromPolygonParamsMaterial = null
  ): MeshCreateFromPolygonParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (material != null) __obj.updateDynamic("material")(material)
    __obj.asInstanceOf[MeshCreateFromPolygonParams]
  }
}

