package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshMaterial extends Accessor {
  /**
    * Specifies how transparency on the object is handled. If `alphaMode` is set to either `mask` or `auto` this property specifies the cutoff value below which masking happens (that is, the coresponding part of the Mesh is rendered fully transparent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff)
    *
    * @default 0.5
    */
  var alphaCutoff: scala.Double = js.native
  /**
    * Specifies how transparency on the object is handled. See also `alphaCutoff`.
    *
    * | Type | Description |
    * |------|-------------|
    * | opaque | Alpha is ignored, and the object is rendered fully opaque. |
    * | blend | Alpha values are used for gradual transparency, blending between the object and its background. |
    * | mask | Alpha values are used for binary transparency, either displaying the object, or its background. See also `alphaCutoff`. |
    * | auto | The implementation mixes the `mask` and `blend` settings, masking below `alphaCutoff` and blending above it. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaMode)
    *
    * @default "auto"
    */
  var alphaMode: java.lang.String = js.native
  /**
    * Allows to specify a single, uniform color for the mesh component. This can be autocast with a named string, hex string, array of rgb or rgba values, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#color)
    */
  var color: Color = js.native
  /**
    * Allows to specify a texture to get color information from. The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#colorTexture)
    */
  var colorTexture: MeshTexture = js.native
  /**
    * Specifies whether both sides of each triangle are displayed, or only the front sides.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#doubleSided)
    *
    * @default true
    */
  var doubleSided: scala.Boolean = js.native
  /**
    * Allows to specify a texture to get normal information from. The texture is accessed using the uv coordinate specified for each vertex in the mesh vertex attributes. Normal mapping requires also for tangents to be specified in the mesh vertex attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture)
    */
  var normalTexture: MeshTexture = js.native
}

@JSGlobal("__esri.MeshMaterial")
@js.native
/**
  * The material determines how a mesh component is visualized. Among other properties, MeshMaterial specifies a color that may be a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) value, as well as a colorTexture that may be a [MeshTexture](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html)), which is mapped to the uv coordinate specified for each vertex in the [Mesh.vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html)
  */
class MeshMaterialCls () extends MeshMaterial {
  def this(properties: MeshMaterialProperties) = this()
}

