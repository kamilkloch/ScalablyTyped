package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDecoderOptions extends js.Object {
  var fatal: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreBOM: js.UndefOr[scala.Boolean] = js.undefined
}

object TextDecoderOptions {
  @scala.inline
  def apply(
    fatal: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreBOM: js.UndefOr[scala.Boolean] = js.undefined
  ): TextDecoderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fatal)) __obj.updateDynamic("fatal")(fatal)
    if (!js.isUndefined(ignoreBOM)) __obj.updateDynamic("ignoreBOM")(ignoreBOM)
    __obj.asInstanceOf[TextDecoderOptions]
  }
}

