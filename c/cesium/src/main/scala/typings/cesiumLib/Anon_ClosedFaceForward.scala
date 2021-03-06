package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClosedFaceForward extends js.Object {
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  var faceForward: js.UndefOr[scala.Boolean] = js.undefined
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  var fragmentShaderSource: js.UndefOr[java.lang.String] = js.undefined
  var material: js.UndefOr[cesiumLib.cesiumMod.Material] = js.undefined
  var materialSupport: js.UndefOr[cesiumLib.cesiumMod.MaterialAppearanceNs.MaterialSupport] = js.undefined
  var renderState: js.UndefOr[cesiumLib.cesiumMod.RenderState] = js.undefined
  var translucent: js.UndefOr[scala.Boolean] = js.undefined
  var vertexShaderSource: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClosedFaceForward {
  @scala.inline
  def apply(
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    faceForward: js.UndefOr[scala.Boolean] = js.undefined,
    flat: js.UndefOr[scala.Boolean] = js.undefined,
    fragmentShaderSource: java.lang.String = null,
    material: cesiumLib.cesiumMod.Material = null,
    materialSupport: cesiumLib.cesiumMod.MaterialAppearanceNs.MaterialSupport = null,
    renderState: cesiumLib.cesiumMod.RenderState = null,
    translucent: js.UndefOr[scala.Boolean] = js.undefined,
    vertexShaderSource: java.lang.String = null
  ): Anon_ClosedFaceForward = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (!js.isUndefined(faceForward)) __obj.updateDynamic("faceForward")(faceForward)
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (fragmentShaderSource != null) __obj.updateDynamic("fragmentShaderSource")(fragmentShaderSource)
    if (material != null) __obj.updateDynamic("material")(material)
    if (materialSupport != null) __obj.updateDynamic("materialSupport")(materialSupport)
    if (renderState != null) __obj.updateDynamic("renderState")(renderState)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    if (vertexShaderSource != null) __obj.updateDynamic("vertexShaderSource")(vertexShaderSource)
    __obj.asInstanceOf[Anon_ClosedFaceForward]
  }
}

