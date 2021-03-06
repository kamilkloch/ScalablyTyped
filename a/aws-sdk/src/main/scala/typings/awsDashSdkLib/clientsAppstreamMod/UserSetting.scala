package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSetting extends js.Object {
  /**
    * The action that is enabled or disabled.
    */
  var Action: awsDashSdkLib.clientsAppstreamMod.Action
  /**
    * Indicates whether the action is enabled or disabled.
    */
  var Permission: awsDashSdkLib.clientsAppstreamMod.Permission
}

object UserSetting {
  @scala.inline
  def apply(Action: Action, Permission: Permission): UserSetting = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserSetting]
  }
}

