package typings
package nodeLib.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOptions extends js.Object {
  var keepOpen: js.UndefOr[scala.Boolean] = js.undefined
}

object MessageOptions {
  @scala.inline
  def apply(keepOpen: js.UndefOr[scala.Boolean] = js.undefined): MessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepOpen)) __obj.updateDynamic("keepOpen")(keepOpen)
    __obj.asInstanceOf[MessageOptions]
  }
}

