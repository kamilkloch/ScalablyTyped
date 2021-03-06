package typings
package facepaintLib.facepaintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var literal: js.UndefOr[scala.Boolean] = js.undefined
  var overlap: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    literal: js.UndefOr[scala.Boolean] = js.undefined,
    overlap: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(literal)) __obj.updateDynamic("literal")(literal)
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap)
    __obj.asInstanceOf[Options]
  }
}

