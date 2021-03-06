package typings
package reactDashMailchimpDashSubscribeLib.reactDashMailchimpDashSubscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[FormFields] extends js.Object {
  var render: js.UndefOr[js.Function1[/* hooks */ FormHooks[FormFields], reactLib.reactMod.ReactNode]] = js.undefined
  var url: java.lang.String
}

object Props {
  @scala.inline
  def apply[FormFields](
    url: java.lang.String,
    render: /* hooks */ FormHooks[FormFields] => reactLib.reactMod.ReactNode = null
  ): Props[FormFields] = {
    val __obj = js.Dynamic.literal(url = url)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[Props[FormFields]]
  }
}

