package typings
package atPulumiAwsLib.ec2transitgatewayRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteArgs extends js.Object {
  /**
    * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
    */
  val destinationCidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Identifier of EC2 Transit Gateway Attachment.
    */
  val transitGatewayAttachmentId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Identifier of EC2 Transit Gateway Route Table.
    */
  val transitGatewayRouteTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object RouteArgs {
  @scala.inline
  def apply(
    destinationCidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    transitGatewayAttachmentId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    transitGatewayRouteTableId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): RouteArgs = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any], transitGatewayRouteTableId = transitGatewayRouteTableId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteArgs]
  }
}

