package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterfacePermissionState extends js.Object {
  /**
    * The state of the permission.
    */
  var State: js.UndefOr[NetworkInterfacePermissionStateCode] = js.undefined
  /**
    * A status message, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}

object NetworkInterfacePermissionState {
  @scala.inline
  def apply(State: NetworkInterfacePermissionStateCode = null, StatusMessage: String = null): NetworkInterfacePermissionState = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    __obj.asInstanceOf[NetworkInterfacePermissionState]
  }
}

