package typings
package popperDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var gpuAcceleration: js.UndefOr[scala.Boolean] = js.undefined
  var x: js.UndefOr[
    popperDotJsLib.popperDotJsLibStrings.bottom | popperDotJsLib.popperDotJsLibStrings.top
  ] = js.undefined
  var y: js.UndefOr[
    popperDotJsLib.popperDotJsLibStrings.left | popperDotJsLib.popperDotJsLibStrings.right
  ] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    gpuAcceleration: js.UndefOr[scala.Boolean] = js.undefined,
    x: popperDotJsLib.popperDotJsLibStrings.bottom | popperDotJsLib.popperDotJsLibStrings.top = null,
    y: popperDotJsLib.popperDotJsLibStrings.left | popperDotJsLib.popperDotJsLibStrings.right = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gpuAcceleration)) __obj.updateDynamic("gpuAcceleration")(gpuAcceleration)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

