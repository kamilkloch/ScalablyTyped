package typings
package paperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Deep extends js.Object {
  var deep: js.UndefOr[scala.Boolean] = js.undefined
  var insert: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Deep {
  @scala.inline
  def apply(deep: js.UndefOr[scala.Boolean] = js.undefined, insert: js.UndefOr[scala.Boolean] = js.undefined): Anon_Deep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    if (!js.isUndefined(insert)) __obj.updateDynamic("insert")(insert)
    __obj.asInstanceOf[Anon_Deep]
  }
}

