package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoveWhereFilters extends js.Object {
  var removeWhereFilters: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_RemoveWhereFilters {
  @scala.inline
  def apply(removeWhereFilters: js.UndefOr[scala.Boolean] = js.undefined): Anon_RemoveWhereFilters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(removeWhereFilters)) __obj.updateDynamic("removeWhereFilters")(removeWhereFilters)
    __obj.asInstanceOf[Anon_RemoveWhereFilters]
  }
}

