package typings
package ssriLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseOptions extends js.Object {
  var options: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var single: js.UndefOr[ssriLib.ssriLibNumbers.`false`] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FalseOptions {
  @scala.inline
  def apply(
    options: js.Array[java.lang.String] = null,
    single: ssriLib.ssriLibNumbers.`false` = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FalseOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (single != null) __obj.updateDynamic("single")(single)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_FalseOptions]
  }
}

