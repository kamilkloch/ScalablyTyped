package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDhcpOptionsRequest extends js.Object {
  /**
    * The ID of the DHCP options set.
    */
  var DhcpOptionsId: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}

object DeleteDhcpOptionsRequest {
  @scala.inline
  def apply(DhcpOptionsId: String, DryRun: js.UndefOr[Boolean] = js.undefined): DeleteDhcpOptionsRequest = {
    val __obj = js.Dynamic.literal(DhcpOptionsId = DhcpOptionsId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteDhcpOptionsRequest]
  }
}

