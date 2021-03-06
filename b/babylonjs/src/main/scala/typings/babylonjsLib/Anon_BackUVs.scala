package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackUVs extends js.Object {
  var backUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var closeArray: js.UndefOr[scala.Boolean] = js.undefined
  var closePath: js.UndefOr[scala.Boolean] = js.undefined
  var colors: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Color4]] = js.undefined
  var frontUVs: js.UndefOr[babylonjsLib.BABYLONNs.Vector4] = js.undefined
  var invertUV: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]]
  var sideOrientation: js.UndefOr[scala.Double] = js.undefined
  var uvs: js.UndefOr[js.Array[babylonjsLib.BABYLONNs.Vector2]] = js.undefined
}

object Anon_BackUVs {
  @scala.inline
  def apply(
    pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]],
    backUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    closeArray: js.UndefOr[scala.Boolean] = js.undefined,
    closePath: js.UndefOr[scala.Boolean] = js.undefined,
    colors: js.Array[babylonjsLib.BABYLONNs.Color4] = null,
    frontUVs: babylonjsLib.BABYLONNs.Vector4 = null,
    invertUV: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    sideOrientation: scala.Int | scala.Double = null,
    uvs: js.Array[babylonjsLib.BABYLONNs.Vector2] = null
  ): Anon_BackUVs = {
    val __obj = js.Dynamic.literal(pathArray = pathArray)
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs)
    if (!js.isUndefined(closeArray)) __obj.updateDynamic("closeArray")(closeArray)
    if (!js.isUndefined(closePath)) __obj.updateDynamic("closePath")(closePath)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs)
    if (!js.isUndefined(invertUV)) __obj.updateDynamic("invertUV")(invertUV)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (uvs != null) __obj.updateDynamic("uvs")(uvs)
    __obj.asInstanceOf[Anon_BackUVs]
  }
}

