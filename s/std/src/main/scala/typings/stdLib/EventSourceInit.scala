package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSourceInit extends js.Object {
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object EventSourceInit {
  @scala.inline
  def apply(withCredentials: js.UndefOr[scala.Boolean] = js.undefined): EventSourceInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[EventSourceInit]
  }
}

