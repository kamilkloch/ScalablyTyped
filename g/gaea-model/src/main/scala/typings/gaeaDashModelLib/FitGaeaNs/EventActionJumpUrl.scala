package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventActionJumpUrl extends js.Object {
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object EventActionJumpUrl {
  @scala.inline
  def apply(url: java.lang.String = null): EventActionJumpUrl = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[EventActionJumpUrl]
  }
}

