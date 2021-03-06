package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableTransitGatewayRouteTablePropagationRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the attachment.
    */
  var TransitGatewayAttachmentId: String
  /**
    * The ID of the propagation route table.
    */
  var TransitGatewayRouteTableId: String
}

object EnableTransitGatewayRouteTablePropagationRequest {
  @scala.inline
  def apply(
    TransitGatewayAttachmentId: String,
    TransitGatewayRouteTableId: String,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): EnableTransitGatewayRouteTablePropagationRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayAttachmentId = TransitGatewayAttachmentId, TransitGatewayRouteTableId = TransitGatewayRouteTableId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[EnableTransitGatewayRouteTablePropagationRequest]
  }
}

