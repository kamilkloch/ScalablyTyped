package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorsColorsPerVertex extends js.Object {
  var colors: js.UndefOr[js.Array[cesiumLib.cesiumMod.Color]] = js.undefined
  var colorsPerVertex: js.UndefOr[scala.Boolean] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var followSurface: js.UndefOr[scala.Boolean] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var positions: js.Array[cesiumLib.cesiumMod.Cartesian3]
}

object Anon_ColorsColorsPerVertex {
  @scala.inline
  def apply(
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    colors: js.Array[cesiumLib.cesiumMod.Color] = null,
    colorsPerVertex: js.UndefOr[scala.Boolean] = js.undefined,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    followSurface: js.UndefOr[scala.Boolean] = js.undefined,
    granularity: scala.Int | scala.Double = null
  ): Anon_ColorsColorsPerVertex = {
    val __obj = js.Dynamic.literal(positions = positions)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(colorsPerVertex)) __obj.updateDynamic("colorsPerVertex")(colorsPerVertex)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (!js.isUndefined(followSurface)) __obj.updateDynamic("followSurface")(followSurface)
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorsColorsPerVertex]
  }
}

