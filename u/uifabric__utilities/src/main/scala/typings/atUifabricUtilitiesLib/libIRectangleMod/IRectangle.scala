package typings
package atUifabricUtilitiesLib.libIRectangleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRectangle extends js.Object {
  var bottom: js.UndefOr[scala.Double] = js.undefined
  var height: scala.Double
  var left: scala.Double
  var right: js.UndefOr[scala.Double] = js.undefined
  var top: scala.Double
  var width: scala.Double
}

object IRectangle {
  @scala.inline
  def apply(
    height: scala.Double,
    left: scala.Double,
    top: scala.Double,
    width: scala.Double,
    bottom: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null
  ): IRectangle = {
    val __obj = js.Dynamic.literal(height = height, left = left, top = top, width = width)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRectangle]
  }
}

