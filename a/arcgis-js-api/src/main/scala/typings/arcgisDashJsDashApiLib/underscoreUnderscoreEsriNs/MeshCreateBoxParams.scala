package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCreateBoxParams
  extends stdLib.Object {
  /**
    * Whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the mesh is created in a Cartesian system with respect to the local coordinate system on the globe and sizes are specified in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createBox)
    */
  var geographic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The face for generating image uv coordinates. By default, a single set of unwrapped UV coordinates are generated for all the faces. By setting the `imageFace` parameter to one of `east`, `west`, `north`, `south`, `up` or `down`, the specified face will have full sized UV coordinates while the other faces will pertain their regular unwrapped UV coordinates. This is useful for applying an image only to a single face of the box. The provided `material` parameter will be applied to the specified `imageFace`. The resulting mesh will have two components, the first contains the selected image face and the second contains the other faces of the box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createBox)
    */
  var imageFace: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The material to be used for the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createBox)
    */
  var material: js.UndefOr[MeshCreateBoxParamsMaterial] = js.undefined
  /**
    * A uniform size value or an object containing individual values width, height and depth. The unit of the size values is derived from the spatial reference of the provided location, unless a unit is specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createBox)
    */
  var size: js.UndefOr[scala.Double | MeshCreateBoxParamsSize] = js.undefined
  /**
    * The unit of the size (defaults to the unit of the location's spatial reference).  **Possible Values:** millimeters | centimeters | decimeters | meters | kilometers | inches | feet | yards | miles | nautical-miles | us-feet
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createBox)
    */
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object MeshCreateBoxParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    geographic: js.UndefOr[scala.Boolean] = js.undefined,
    imageFace: java.lang.String = null,
    material: MeshCreateBoxParamsMaterial = null,
    size: scala.Double | MeshCreateBoxParamsSize = null,
    unit: java.lang.String = null
  ): MeshCreateBoxParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(geographic)) __obj.updateDynamic("geographic")(geographic)
    if (imageFace != null) __obj.updateDynamic("imageFace")(imageFace)
    if (material != null) __obj.updateDynamic("material")(material)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[MeshCreateBoxParams]
  }
}

