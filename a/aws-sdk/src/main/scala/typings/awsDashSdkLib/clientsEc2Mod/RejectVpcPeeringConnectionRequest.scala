package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectVpcPeeringConnectionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: String
}

object RejectVpcPeeringConnectionRequest {
  @scala.inline
  def apply(VpcPeeringConnectionId: String, DryRun: js.UndefOr[Boolean] = js.undefined): RejectVpcPeeringConnectionRequest = {
    val __obj = js.Dynamic.literal(VpcPeeringConnectionId = VpcPeeringConnectionId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[RejectVpcPeeringConnectionRequest]
  }
}

