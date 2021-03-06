package typings
package awsDashSdkLib.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalizeDeviceClaimRequest extends js.Object {
  /**
    * The unique identifier of the device.
    */
  var DeviceId: __string
  /**
    * A collection of key/value pairs defining the resource tags. For example, {
    "tags": {"key1": "value1", "key2": "value2"} }. For more information, see AWS
    Tagging Strategies.
    
    
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
}

object FinalizeDeviceClaimRequest {
  @scala.inline
  def apply(DeviceId: __string, Tags: __mapOf__string = null): FinalizeDeviceClaimRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[FinalizeDeviceClaimRequest]
  }
}

