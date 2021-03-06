package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayInfo extends js.Object {
  /**
    * The ID of the Amazon EC2 instance that was used to launch the gateway.
    */
  var Ec2InstanceId: js.UndefOr[Ec2InstanceId] = js.undefined
  /**
    * The AWS Region where the Amazon EC2 instance is located.
    */
  var Ec2InstanceRegion: js.UndefOr[Ec2InstanceRegion] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and region.
    */
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
    */
  var GatewayId: js.UndefOr[GatewayId] = js.undefined
  /**
    * The name of the gateway.
    */
  var GatewayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The state of the gateway. Valid Values: DISABLED or ACTIVE
    */
  var GatewayOperationalState: js.UndefOr[GatewayOperationalState] = js.undefined
  /**
    * The type of the gateway.
    */
  var GatewayType: js.UndefOr[GatewayType] = js.undefined
}

object GatewayInfo {
  @scala.inline
  def apply(
    Ec2InstanceId: Ec2InstanceId = null,
    Ec2InstanceRegion: Ec2InstanceRegion = null,
    GatewayARN: GatewayARN = null,
    GatewayId: GatewayId = null,
    GatewayName: java.lang.String = null,
    GatewayOperationalState: GatewayOperationalState = null,
    GatewayType: GatewayType = null
  ): GatewayInfo = {
    val __obj = js.Dynamic.literal()
    if (Ec2InstanceId != null) __obj.updateDynamic("Ec2InstanceId")(Ec2InstanceId)
    if (Ec2InstanceRegion != null) __obj.updateDynamic("Ec2InstanceRegion")(Ec2InstanceRegion)
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (GatewayId != null) __obj.updateDynamic("GatewayId")(GatewayId)
    if (GatewayName != null) __obj.updateDynamic("GatewayName")(GatewayName)
    if (GatewayOperationalState != null) __obj.updateDynamic("GatewayOperationalState")(GatewayOperationalState)
    if (GatewayType != null) __obj.updateDynamic("GatewayType")(GatewayType)
    __obj.asInstanceOf[GatewayInfo]
  }
}

