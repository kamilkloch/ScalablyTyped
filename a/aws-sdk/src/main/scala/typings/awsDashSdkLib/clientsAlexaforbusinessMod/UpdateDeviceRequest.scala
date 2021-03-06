package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeviceRequest extends js.Object {
  /**
    * The ARN of the device to update. Required.
    */
  var DeviceArn: js.UndefOr[Arn] = js.undefined
  /**
    * The updated device name. Required.
    */
  var DeviceName: js.UndefOr[DeviceName] = js.undefined
}

object UpdateDeviceRequest {
  @scala.inline
  def apply(DeviceArn: Arn = null, DeviceName: DeviceName = null): UpdateDeviceRequest = {
    val __obj = js.Dynamic.literal()
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn)
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    __obj.asInstanceOf[UpdateDeviceRequest]
  }
}

