package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferOptions extends js.Object {
  var autoPrint: js.UndefOr[scala.Boolean] = js.undefined
}

object BufferOptions {
  @scala.inline
  def apply(autoPrint: js.UndefOr[scala.Boolean] = js.undefined): BufferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPrint)) __obj.updateDynamic("autoPrint")(autoPrint)
    __obj.asInstanceOf[BufferOptions]
  }
}

