package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachVpnGatewayRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: String
  /**
    * The ID of the virtual private gateway.
    */
  var VpnGatewayId: String
}

object AttachVpnGatewayRequest {
  @scala.inline
  def apply(VpcId: String, VpnGatewayId: String, DryRun: js.UndefOr[Boolean] = js.undefined): AttachVpnGatewayRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId, VpnGatewayId = VpnGatewayId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[AttachVpnGatewayRequest]
  }
}

