package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVirtualMFADevicesResponse extends js.Object {
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.undefined
  /**
    *  The list of virtual MFA devices in the current account that match the AssignmentStatus value that was passed in the request.
    */
  var VirtualMFADevices: virtualMFADeviceListType
}

object ListVirtualMFADevicesResponse {
  @scala.inline
  def apply(
    VirtualMFADevices: virtualMFADeviceListType,
    IsTruncated: js.UndefOr[booleanType] = js.undefined,
    Marker: responseMarkerType = null
  ): ListVirtualMFADevicesResponse = {
    val __obj = js.Dynamic.literal(VirtualMFADevices = VirtualMFADevices)
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListVirtualMFADevicesResponse]
  }
}

