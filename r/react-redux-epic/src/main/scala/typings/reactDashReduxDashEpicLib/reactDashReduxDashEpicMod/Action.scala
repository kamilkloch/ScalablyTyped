package typings
package reactDashReduxDashEpicLib.reactDashReduxDashEpicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var `type`: java.lang.String
}

object Action {
  @scala.inline
  def apply(`type`: java.lang.String): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Action]
  }
}

