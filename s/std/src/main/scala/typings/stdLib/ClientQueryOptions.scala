package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientQueryOptions extends js.Object {
  var includeUncontrolled: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[ClientTypes] = js.undefined
}

object ClientQueryOptions {
  @scala.inline
  def apply(includeUncontrolled: js.UndefOr[scala.Boolean] = js.undefined, `type`: ClientTypes = null): ClientQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeUncontrolled)) __obj.updateDynamic("includeUncontrolled")(includeUncontrolled)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ClientQueryOptions]
  }
}

