package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Persistent extends js.Object {
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  var suppressRebuildEvent: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Persistent {
  @scala.inline
  def apply(
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    suppressRebuildEvent: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Persistent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (!js.isUndefined(suppressRebuildEvent)) __obj.updateDynamic("suppressRebuildEvent")(suppressRebuildEvent)
    __obj.asInstanceOf[Anon_Persistent]
  }
}

